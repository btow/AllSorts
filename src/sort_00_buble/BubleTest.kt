package sort_00_buble

import general_enviropment.SetUpTestEnvironment
import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 06.11.2018.
 * Пузырьковая сортировка вставками O(n^2)
 */
class BubleTest : Exception() {

    lateinit var noSortArray: CharArray
    lateinit var expSortArray: CharArray

    @org.junit.Before
    fun setUp() {
        val testEnvironment = SetUpTestEnvironment()
        noSortArray = testEnvironment.noSortArray
        expSortArray = testEnvironment.expSortArray
    }

    @org.junit.Test
    fun getSortedArray() {
        val actSortedArray = Buble(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}