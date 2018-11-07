package sort_05_selection

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором O(n^2)
 */
class Selection(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val end = charArray.size - 1
        for (i in 0..end) {
            var min = i
            for (j in (i + 1)..end){
                if (charArray[j] < charArray[min])
                    min = j
            }
            val tmp = charArray[i]
            charArray[i] = charArray[min]
            charArray[min] = tmp
        }
        return charArray
    }
}