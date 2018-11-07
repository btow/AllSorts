package sort_02_shaker

/**
 * Created by btow on 06.11.2018.
 * Шейкерная сортировка O(n^2)
 */
class Shaker(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        var beg = 0
        var end = charArray.size - 1
        while (beg < end) {
            for (i in ++beg..end) {
                if (charArray[i - 1] > charArray[i]) {
                    val temp = charArray[i]
                    charArray[i] = charArray[i - 1]
                    charArray[i - 1] = temp
                }
            }
            end--
            for (j in --end downTo --beg) {
                if (charArray[j + 1] < charArray[j]) {
                    val temp = charArray[j]
                    charArray[j] = charArray[j + 1]
                    charArray[j + 1] = temp
                }
            }
            end++
            beg++
        }
        return charArray
    }
}