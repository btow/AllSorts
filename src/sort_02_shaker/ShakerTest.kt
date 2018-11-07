package sort_02_shaker

import org.junit.Assert.*
import java.util.*
import org.junit.Before
import org.junit.Test

/**
 * Created by btow on 07.11.2018.
 */
class ShakerTest : Exception() {

    lateinit var noSortAfrray: CharArray
    lateinit var expSortArray: CharArray

    @Before
    fun setUp() {
        noSortAfrray = charArrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
        expSortArray = noSortAfrray.copyOf()
        Arrays.sort(expSortArray)
    }

    @Test
    fun getSortedArray() {
        val actSortedArray = Shaker(noSortAfrray).getSortedArray()
        assertArrayEquals(expSortArray, actSortedArray)
    }
}