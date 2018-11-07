package sort_04_comb

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 07.11.2018.
 */
class CombTest : Exception() {

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
        val actSortedArray = Comb(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}