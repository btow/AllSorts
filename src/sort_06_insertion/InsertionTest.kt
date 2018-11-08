package sort_06_insertion

import general_enviropment.SetUpTestEnvironment
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 07.11.2018.
 * Сортировка вставками O(n^2)
 */
class InsertionTest : Exception() {

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
        val actSortedArray = Insertion(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}