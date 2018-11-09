package sort_07_insertion_shell

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором (Шелла) до O(log n)
 */
class InsertioninShell(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val end = charArray.size - 1
        var step = 1
        while (step < end / 3)
            step = 3 * step + 1
        while (step > 0) {
            for (i in step..end) {
                for (j in i downTo step step step){
                    val tmp = charArray[j]
                    if (charArray[j] < charArray[j - step]) {
                        charArray[j] = charArray[j - step]
                        charArray[j - step] = tmp
                    }
                }
            }
            step /= 3
        }
        return charArray
    }
}