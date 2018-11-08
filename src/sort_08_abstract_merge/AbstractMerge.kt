package sort_08_abstract_merge

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором (Шелла) до O(log n)
 */
class AbstractMerge(val charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val end = charArray.size - 1
        val left = 0
        val mid = end / 2
        return sortArray(charArray, left, mid, end)
    }

    private fun sortArray(charArray: CharArray, left: Int, mid: Int, end: Int): CharArray {
        val newCharArray = CharArray(charArray.size)
        if (charArray.size > 2) {
            val leftCharArray = sortArray(
                    charArray.copyOfRange(left, mid + 1), 0, mid / 2, mid)
            val rigthCharArray = sortArray(
                    charArray.copyOfRange(mid + 1, end + 1), 0, (end - mid + 2) / 2, (end - mid + 2))
            var lft = left
            var right = 0

            for (k in lft..end) {
                if (lft > mid)
                    newCharArray[k] = rigthCharArray[right++]
                else if (right >= rigthCharArray.size)
                    newCharArray[k] = leftCharArray[lft++]
                else if (rigthCharArray[right] < leftCharArray[lft])
                    newCharArray[k] = rigthCharArray[right++]
                else
                    newCharArray[k] = leftCharArray[lft++]
            }
        } else if (charArray[0] > charArray[1]) {
            newCharArray[0] = charArray[1]
            newCharArray[1] = charArray[0]
        }
        return newCharArray
    }
}