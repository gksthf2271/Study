package com.example.TEST

class test3 {
    val house = "H"
    val blank = "-"
    fun solution(G: String): Int {
        var tankCount = -1

        var inputArray = G.toCharArray()
        for (idx in inputArray.indices) {
            checkSidePlace(idx, inputArray)
        }
        return tankCount
    }

    fun checkSidePlace(idx: Int, inputArray : CharArray) {
        for (idx in idx downTo 0) {
            if (inputArray[idx].equals(house)) {

            }
        }

        for (idx in idx until inputArray.size) {

        }
    }
}