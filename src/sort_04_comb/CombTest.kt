package sort_04_comb

import general_enviropment.SetUpTestEnvironment
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 07.11.2018.
 * гребешковая сортировка вставками от O(n) до O(n^2), в среднем O(n log n)
 */
class CombTest : Exception() {

    lateinit var noSortArray: CharArray
    lateinit var expSortArray: CharArray

    @Before
    fun setUp() {
        val testEnvironment = SetUpTestEnvironment()
        noSortArray = testEnvironment.noSortArray
        expSortArray = testEnvironment.expSortArray
    }

    @Test
    fun getSortedArray() {
        val actSortedArray = Comb(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}