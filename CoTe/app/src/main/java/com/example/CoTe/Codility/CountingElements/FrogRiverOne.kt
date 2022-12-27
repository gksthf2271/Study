package com.example.CoTe.Codility.CountingElements

class FrogRiverOne {
    fun main() {
        val input: ArrayList<Int> = arrayListOf(1, 3, 1, 4, 2, 3, 5, 4)
        print("FrogRiverOne 답 : ${solution(5, input.toIntArray())}\n")
    }

    private fun solution(X: Int, A: IntArray): Int {
        var result = -1
        val leafMap = hashMapOf<Int, Boolean>()
        for (idx in 1 until A.size) {
            leafMap.put(A[idx], true)
            if (leafMap.keys.size == X) {
                result = idx
                return result
            }
        }
        return result
    }
}