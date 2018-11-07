package sort_03_even_odd

/**
 * Created by btow on 06.11.2018.
 * Чётно-нечётная сортировка O(n^2)
 */
class EvenOdd(var charArray: CharArray) {

    fun getSortedArray() : CharArray {
        val end = charArray.size - 1
        var count = 0
        while (count < 2) {
            var noExch = true
            for (i in 1..end step 2)
                if (charArray[i - 1] > charArray[i]){
                    val temp = charArray[i]
                    charArray[i] = charArray[i - 1]
                    charArray[i - 1] = temp
                    noExch = false
                    count = 0
                }
            for (i in 2..end step 2)
                if (charArray[i - 1] > charArray[i]){
                    val temp = charArray[i]
                    charArray[i] = charArray[i - 1]
                    charArray[i - 1] = temp
                    noExch = false
                    count = 0
                }
            if (noExch) count++
        }
        return charArray
    }
}