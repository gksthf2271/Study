package com.example.CoTe.Programmers.LV2

/**
문제 설명
완호가 관리하는 어떤 데이터베이스의 한 테이블은 모두 정수 타입인 컬럼들로 이루어져 있습니다. 테이블은 2차원 행렬로 표현할 수 있으며 열은 컬럼을 나타내고, 행은 튜플을 나타냅니다.
첫 번째 컬럼은 기본키로서 모든 튜플에 대해 그 값이 중복되지 않도록 보장됩니다. 완호는 이 테이블에 대한 해시 함수를 다음과 같이 정의하였습니다.

해시 함수는 col, row_begin, row_end을 입력으로 받습니다.
테이블의 튜플을 col번째 컬럼의 값을 기준으로 오름차순 정렬을 하되, 만약 그 값이 동일하면 기본키인 첫 번째 컬럼의 값을 기준으로 내림차순 정렬합니다.
정렬된 데이터에서 S_i를 i 번째 행의 튜플에 대해 각 컬럼의 값을 i 로 나눈 나머지들의 합으로 정의합니다.
row_begin ≤ i ≤ row_end 인 모든 S_i를 누적하여 bitwise XOR 한 값을 해시 값으로서 반환합니다.
테이블의 데이터 data와 해시 함수에 대한 입력 col, row_begin, row_end이 주어졌을 때 테이블의 해시 값을 return 하도록 solution 함수를 완성해주세요.
 */

class LV002 {
    init {
        /**
         * 2, 2, 6
         * 1, 5, 10
         * 4, 2, 9
         * 3, 8, 3
         */
        val inputData = arrayOf<IntArray>(intArrayOf(2,2,6),intArrayOf(1,5,10),intArrayOf(4,2,9),intArrayOf(3,8,3))
        solution(inputData, 2, 2, 3)
    }

    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        var answer: Int = 0


        return answer
    }
}