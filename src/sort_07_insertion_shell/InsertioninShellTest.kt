package sort_07_insertion_shell

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 08.11.2018.
 * Сортировка вставками (Шелла) до O(log n)
 */
class InsertioninShellTest : Exception() {

    lateinit var noSortArray: CharArray
    lateinit var expSortArray: CharArray

    @Before
    fun setUp() {
        noSortArray = charArrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
        expSortArray = noSortArray.copyOf()
        Arrays.sort(expSortArray)
    }

    @Test
    fun getSortedArray() {
        val actSortedArray = InsertioninShell(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}