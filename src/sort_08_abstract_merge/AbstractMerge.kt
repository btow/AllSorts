package sort_08_abstract_merge

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором (Шелла) до O(log n)
 */
class AbstractMerge(var charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val newCharArray = charArray.copyOf()
        val end = charArray.size - 1
        var left = 0
        var mid = end/2
        var right = mid + 1
        for (k in left..end){
            if (left > mid) charArray[k] = newCharArray[right++]
            else if (right > end) charArray[k] = newCharArray[left++]
            else if (newCharArray[right] < newCharArray[left]) charArray[k] = newCharArray[right++]
            else charArray[k] = newCharArray[left++]
        }

        return charArray
    }
}