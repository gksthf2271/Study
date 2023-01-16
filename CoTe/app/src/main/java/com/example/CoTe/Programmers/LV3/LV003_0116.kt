package com.example.CoTe.Programmers.LV3

/*
가장 긴 팰린드롬

문제 설명
앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 완성해 주세요.

예를들면, 문자열 s가 "abcdcba"이면 7을 return하고 "abacde"이면 3을 return합니다.

제한사항
문자열 s의 길이 : 2,500 이하의 자연수
문자열 s는 알파벳 소문자로만 구성
* */
class LV003_0116 {
    fun solution(s: String): Int {
        val chr = s.toCharArray()
        for (leng in s.length downTo 2) {
            var start = 0
            while (start + leng <= s.length) {
                var chk = true
                for (i in 0 until leng / 2) {
                    if (chr[start + i] != chr[start + leng - i - 1]) {
                        chk = false
                        break
                    }
                }
                if (chk) return leng
                start++
            }
        }
        return 1
    }
}