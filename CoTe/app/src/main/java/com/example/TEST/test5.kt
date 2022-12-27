package com.example.TEST

class test5 {
    var result = 0
    var K = 0;
    fun solution(): Int {
        K = 8
        check(1, 5, 8)
        print("\n[결과] : $result\n")
        return result
    }

    fun check(i: Int, n: Int, sum: Int) {
        if (sum == 0) {
            result++
        }
        for (j in i..n) {
            check(i+1, n, sum-j)
        }
    }
}