package sort_06_insertion

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором O(n^2)
 */
class Insertion(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val end = charArray.size - 1
        for (i in 1..end) {
            for (j in i downTo 1){
                if (charArray[j] < charArray[j -1]){
                    val tmp = charArray[j]
                    charArray[j] = charArray[j - 1]
                    charArray[j - 1] = tmp
                }
            }
        }
        return charArray
    }
}