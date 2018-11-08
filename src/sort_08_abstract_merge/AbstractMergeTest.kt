package sort_08_abstract_merge

import general_enviropment.SetUpTestEnvironment
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 08.11.2018.
 * Сортировка вставками (Шелла) до O(log n)
 */
class AbstractMergeTest : Exception() {

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
        val actSortedArray = AbstractMerge(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}