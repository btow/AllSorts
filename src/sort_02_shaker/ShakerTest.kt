package sort_02_shaker

import general_enviropment.SetUpTestEnvironment
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by btow on 07.11.2018.
 * Шейкерная сортировка вставками O(n^2)
 */
class ShakerTest : Exception() {

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
        val actSortedArray = Shaker(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}