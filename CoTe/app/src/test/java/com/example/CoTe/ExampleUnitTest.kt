package com.example.CoTe

import com.example.CoTe.Codility.Arrays.CyclicRotation
import com.example.CoTe.Codility.Arrays.OddOccurrencesInArray
import com.example.CoTe.Codility.CountingElements.FrogRiverOne
import com.example.CoTe.Codility.Iterations.Binary
import com.example.CoTe.Programmers.LV1.LV001
import com.example.CoTe.Programmers.LV3.LV003_0114
import com.example.CoTe.Programmers.LV3.LV003_0116
import com.example.CoTe.Programmers.LV3.LV003_0117
import com.example.CoTe.Time.FrogJmp
import com.example.CoTe.Time.PermMissingElem
import com.example.CoTe.Time.TapeEquilibrium
import com.example.TEST.test5
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun cote_binary() {
        Binary().main()
    }

    @Test
    fun cote_CycleRotation() {
        CyclicRotation().main()
    }

    @Test
    fun cote_OddOccurrencesInArray() {
        OddOccurrencesInArray().main()
    }

    @Test
    fun cote_FrogJmp() {
        FrogJmp().main()
    }
    @Test
    fun cote_PermMissingElem() {
        PermMissingElem().main()
    }
    @Test
    fun cote_TapeEquillibrium() {
        TapeEquilibrium().main()
    }
    @Test
    fun cote_FrogRiverOne() {
        FrogRiverOne().main()
    }

    @Test
    fun test() {
        test5().solution();
    }

    @Test
    fun Programmers_lv1() {
        LV001()
    }

    @Test
    fun Programmers_lv3() {
        LV003_0114().solution(
            n = 5,
            roads = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 4),
                intArrayOf(2, 4),
                intArrayOf(2, 5),
                intArrayOf(4, 5)
            ),
            sources = intArrayOf(1, 3, 5),
            5
        )
    }

    @Test
    fun Programmers_lv3_0116() {
        println("답 : ${LV003_0116().solution("abcdcba")}")
    }

    @Test
    fun Programmers_lv3_0117() {
        LV003_0117().solution(
            genres = arrayOf("Rock", "classic", "pop", "classic", "classic", "pop", "classic"),
            intArrayOf(300, 500, 600, 150, 800, 2500, 500))
    }
}