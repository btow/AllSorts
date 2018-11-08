package general_enviropment

import java.util.*

class SetUpTestEnvironment {

    var noSortArray: CharArray = charArrayOf('S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E')
    var expSortArray: CharArray

    init {
        expSortArray = noSortArray.copyOf()
        Arrays.sort(expSortArray)
    }
}