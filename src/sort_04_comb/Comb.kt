package sort_04_comb

/**
 * Created by btow on 07.11.2018.
 * Расчёсочная сортировка от O(n) до O(n^2), в среднем O(n log n)
 */
class Comb(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val reductionFactor = 1.247
        var step = charArray.size
        val end = step - 1
        do {
            step = (step/reductionFactor).toInt()
            for (i in step..end){
                if (charArray[i - step] > charArray[i]){
                    val temp = charArray[i]
                    charArray[i] = charArray[i - step]
                    charArray[i - step] = temp
                }
            }
        } while (step > 1)
        for (i in 1..end){
            if (charArray[i - 1] > charArray[i]) {
                val temp = charArray[i]
                charArray[i] = charArray[i - 1]
                charArray[i - 1] = temp
            }
        }
        return charArray;
    }
}