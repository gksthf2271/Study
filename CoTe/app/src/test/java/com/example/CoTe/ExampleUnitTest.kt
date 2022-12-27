package com.example.CoTe

import com.example.CoTe.Codility.Arrays.CyclicRotation
import com.example.CoTe.Codility.Arrays.OddOccurrencesInArray
import com.example.CoTe.Codility.CountingElements.FrogRiverOne
import com.example.CoTe.Codility.Iterations.Binary
import com.example.CoTe.Programmers.LV1.LV001
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
}