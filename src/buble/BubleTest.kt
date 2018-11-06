package buble

import org.junit.Assert.*
import java.util.*

/**
 * Created by btow on 06.11.2018.
 */
class BubleTest : Exception() {

    lateinit var noSortAfrray: CharArray
    lateinit var expSortArray: CharArray

    @org.junit.Before
    fun setUp() {
        noSortAfrray = charArrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
        expSortArray = noSortAfrray.copyOf()
        Arrays.sort(expSortArray)
    }

    @org.junit.Test
    fun getSortedArray() {

        val actSortedArray = Buble(noSortAfrray).getSortedArray()

        assertArrayEquals(expSortArray, actSortedArray)
    }
}