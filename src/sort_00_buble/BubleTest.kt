package sort_00_buble

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 06.11.2018.
 */
class BubleTest : Exception() {

    lateinit var noSortArray: CharArray
    lateinit var expSortArray: CharArray

    @org.junit.Before
    fun setUp() {
        noSortArray = charArrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
        expSortArray = noSortArray.copyOf()
        Arrays.sort(expSortArray)
    }

    @org.junit.Test
    fun getSortedArray() {
        val actSortedArray = Buble(noSortArray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}