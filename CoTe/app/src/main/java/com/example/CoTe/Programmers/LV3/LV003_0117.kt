package com.example.CoTe.Programmers.LV3

import java.util.PriorityQueue

/*
베스트앨범

* 문제 설명
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.
* */

class LV003_0117 {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val answer = arrayListOf<Int>()
        val genreMap = hashMapOf<String, Genre>()
        val lambda = { a: Int, b: Int ->
            when {
                a < b -> 1
                a > b -> -1
                else -> 0
            }
        }
        for (idx in genres.indices) {
            if (genreMap[genres[idx]] == null) {
                val songQueue = PriorityQueue(Comparator<Song>{ song1, song2 ->
                    when {
                        (song1.playCount != song2.playCount) -> lambda(song1.playCount, song2.playCount)
                        else -> lambda(song2.idx, song1.idx)
                    }
                })
                songQueue.add(Song(idx, plays[idx]))
                genreMap[genres[idx]] = Genre(genres[idx], plays[idx], songQueue)
            } else {
                val savedGenre = genreMap[genres[idx]]
                val savedSongQueue = savedGenre!!.songQueue
                val savedTotalCount =  savedGenre.totalPlayCount
                savedSongQueue.add(Song(idx,plays[idx]))

                genreMap[genres[idx]] = Genre(savedGenre.name, savedTotalCount + plays[idx], savedSongQueue)
            }
        }

        val queue = PriorityQueue(Comparator<Genre>{genre1, genre2 ->
            lambda(genre1.totalPlayCount, genre2.totalPlayCount)
        })
        for (genre in genreMap.values) {
            queue.add(genre)
        }

        for (idx in queue.indices) {
            val genre = queue.poll()
            if (genre.songQueue.size > 1) {
                answer.add(genre.songQueue.poll().idx)
                answer.add(genre.songQueue.poll().idx)
            } else {
                answer.add(genre.songQueue.poll().idx)
            }
        }
        println("답 : $answer")
        return answer.toIntArray()
    }

    data class Song(var idx: Int, var playCount : Int)
    data class Genre(var name: String, var totalPlayCount : Int, var songQueue: PriorityQueue<Song>)
}