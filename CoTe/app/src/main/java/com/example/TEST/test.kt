package com.example.TEST

class test {
    fun main() {
        val input: String = ""
        print("OddOccurrencesInArray 답 : ${solution(input)}\n")
    }

    fun solution(G: String): Int {
        val inputArray = G.toCharArray()
        val inputHashMap = hashMapOf<String, Int>().apply {
            for (item in inputArray.iterator()) {
                this[item.toString()] = (this[item.toString()] ?: 0) + 1
            }
        }
        val input = arrayListOf<String>("R","P","S")
        var resultPoint = 0
        for (g in input) {
            var point = 0
            val count = inputHashMap[g] ?: 0
            point += (count * 2)
            when (g) {
                "R" -> {
                    point += inputHashMap["P"] ?: 0
                }
                "P" -> {
                    point += inputHashMap["S"] ?: 0
                }
                "S" -> {
                    point += inputHashMap["R"] ?: 0
                }
            }
            if (resultPoint < point) {
                resultPoint = point
            }
        }
        return resultPoint
    }
}