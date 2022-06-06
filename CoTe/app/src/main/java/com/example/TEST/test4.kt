package com.example.TEST

class test4 {
    var resultCount = 0
    var mInputArray = listOf<Int>()
    fun solution(A: IntArray): Int {
        mInputArray = A.toList()
        var resultCount = -1
        return checkNextTreeSize(A.toList())
    }

    fun checkNextTreeSize(array: List<Int>) : Int {
        for (idx in array.indices) {
            if (idx == 0 || idx == array.lastIndex) {
                continue
            }
            if ((array[idx - 1] < array[idx] && array[idx] < array[idx + 1])
                || (array[idx - 1] > array[idx] && array[idx] > array[idx + 1])) {
                var nextStartIdx = idx + 1
                if (array.size != mInputArray.size || nextStartIdx >= array.size) {
                    return -1
                } else {
                    checkNextTreeSize(array.subList(nextStartIdx, array.size))
                }
            } else {
                resultCount++
            }
        }
        return resultCount
    }
}