package com.example.CoTe.Programmers.LV2

import java.util.*

class LV002_0204 {
    fun solution(numbers: IntArray): IntArray {
        val stack: Stack<Int> = Stack()
        val ret = IntArray(numbers.size)
        for (i in numbers.indices) {
            if (stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i)
            } else {
                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                    ret[stack.pop()] = numbers[i]
                }
                stack.push(i)
            }
        }
        while (!stack.isEmpty()) {
            ret[stack.pop()] = -1
        }
        println("답 : ${ret.toList()}")
        return ret
    }
}