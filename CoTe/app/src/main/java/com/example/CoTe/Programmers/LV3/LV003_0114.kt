package com.example.CoTe.Programmers.LV3

import java.util.*
import kotlin.collections.ArrayList

/*
부대복귀

문제 설명
강철부대의 각 부대원이 여러 지역에 뿔뿔이 흩어져 특수 임무를 수행 중입니다. 지도에서 강철부대가 위치한 지역을 포함한 각 지역은 유일한 번호로 구분되며, 두 지역 간의 길을 통과하는 데 걸리는 시간은 모두 1로 동일합니다. 임무를 수행한 각 부대원은 지도 정보를 이용하여 최단시간에 부대로 복귀하고자 합니다. 다만 적군의 방해로 인해, 임무의 시작 때와 다르게 되돌아오는 경로가 없어져 복귀가 불가능한 부대원도 있을 수 있습니다.
강철부대가 위치한 지역을 포함한 총지역의 수 n, 두 지역을 왕복할 수 있는 길 정보를 담은 2차원 정수 배열 roads, 각 부대원이 위치한 서로 다른 지역들을 나타내는 정수 배열 sources, 강철부대의 지역 destination이 주어졌을 때, 주어진 sources의 원소 순서대로 강철부대로 복귀할 수 있는 최단시간을 담은 배열을 return하는 solution 함수를 완성해주세요. 복귀가 불가능한 경우 해당 부대원의 최단시간은 -1입니다.
*/


class LV003_0114 {
    val graph = hashMapOf<Int, ArrayList<Edge>>()
    val distances = hashMapOf<Int, Int>()

    fun solution(n: Int, roads: Array<IntArray>, sources: IntArray, destination: Int): IntArray {
        val answer = arrayListOf<Int>()
        for (road in roads) {
            val first = road[0]
            val second = road[1]
            if (graph[first] == null) graph[first] = arrayListOf()
            if (graph[second] == null) graph[second] = arrayListOf()
            graph[first]?.add(Edge(1, second))
            graph[second]?.add(Edge(1,first))
        }

        for (index in 1 .. n) {
            distances[index] = Int.MAX_VALUE
        }

        startDijkstra(destination)

        for (source in sources) {
            answer.add(if (distances[source]!! < Int.MAX_VALUE) distances[source]!! else -1)
        }

        println("result : $answer")
        return answer.toIntArray()
    }

    private fun startDijkstra(destination: Int) : Int {
        val priorityQueue = PriorityQueue<Edge>()
        distances[destination] = 0
        priorityQueue.add(Edge(0, destination))

        while(!priorityQueue.isEmpty()) {
            val qNode: Edge = priorityQueue.poll()
            if (qNode.distance > distances[qNode.nodeName]!! ) continue

            val currentNodeList = graph[qNode.nodeName]
            currentNodeList ?: return -1

            for (adjacentNode in currentNodeList) {
                val adjacent = adjacentNode.nodeName
                val weight = adjacentNode.distance
                val distance = weight + qNode.distance
                if (distance < distances[adjacent]!!) {
                    distances[adjacent] = distance
                    priorityQueue.add(Edge(distance, adjacent))
                }
            }
        }
        if (distances[destination]!! == Int.MAX_VALUE) {
            return -1
        }
        println("결과 > destination : $destination / 전체 경로 : $distances")
        return distances[destination]!!
    }
    class Edge(var distance: Int, var nodeName: Int) : Comparable<Edge>  {
        override fun compareTo(other: Edge): Int {
            return this.distance - other.distance
        }
    }
}