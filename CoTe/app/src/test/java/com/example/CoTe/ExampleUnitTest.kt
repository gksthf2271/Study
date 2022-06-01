package com.example.CoTe

import com.example.CoTe.Arrays.CyclicRotation
import com.example.CoTe.Arrays.OddOccurrencesInArray
import com.example.CoTe.Iterations.Binary
import com.example.CoTe.Time.FrogJmp
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
}