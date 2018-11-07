package sort_07_insertion_shell

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором O(n^2)
 */
class InsertioninShell(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val end = charArray.size - 1
        var step = 1
        while (step < end/3)
            step = 3 * step + 1
        while (step >= 1) {
            for (i in step..end){
                for (j in i downTo step step step)
                if (charArray[j] < charArray[j - step]){
                    val tmp = charArray[j]
                    charArray[j] = charArray[i - step]
                    charArray[j - step] = tmp
                }
            }
            step /= 3
        }
        return charArray
    }
}