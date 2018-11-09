package sort_08_abstract_merge

/**
 * Created by btow on 07.11.2018.
 * Сортировка выыбором (Шелла) до O(log n)
 */
class AbstractMerge(val charArray: CharArray) {

    fun getSortedArray(): CharArray {
        val arrayMidEnd = getArrayMidEnd(charArray)
        return sortArray(arrayMidEnd)
    }

    private fun getArrayMidEnd(charArray: CharArray): ArrayMidEnd {
        return ArrayMidEnd(charArray, (charArray.size - 1) / 2, charArray.size - 1)
    }

    private fun sortArray(arrayMidEnd: ArrayMidEnd): CharArray {
        when {
            arrayMidEnd.charArray.size > 2 -> return mergeCharAray(
                    sortArray(getLeftArray(arrayMidEnd)),
                    sortArray(getRigthArray(arrayMidEnd)))
            arrayMidEnd.charArray.size == 2 -> {
                val newCharArray = CharArray(arrayMidEnd.charArray.size)
                if (arrayMidEnd.charArray[0] > arrayMidEnd.charArray[1]) {
                    newCharArray[0] = arrayMidEnd.charArray[1]
                    newCharArray[1] = arrayMidEnd.charArray[0]
                } else {
                    newCharArray[0] = arrayMidEnd.charArray[0]
                    newCharArray[1] = arrayMidEnd.charArray[1]
                }
                return newCharArray
            }
            else -> return arrayMidEnd.charArray.copyOf()
        }

    }

    private fun mergeCharAray(leftCharArray: CharArray, rightCharArray: CharArray): CharArray {

        val newCharArray = CharArray((leftCharArray.size + rightCharArray.size))
        var left = 0
        var right = 0

        for (k in 0..(leftCharArray.size + rightCharArray.size - 1)) {
            when {
                left > (leftCharArray.size - 1) -> newCharArray[k] = rightCharArray[right++]
                right > (rightCharArray.size - 1) -> newCharArray[k] = leftCharArray[left++]
                rightCharArray[right] < leftCharArray[left] -> newCharArray[k] = rightCharArray[right++]
                else -> newCharArray[k] = leftCharArray[left++]
            }
        }
        return newCharArray
    }

    private fun getRigthArray(arrayMidEnd: ArrayMidEnd): ArrayMidEnd {
        return ArrayMidEnd(
                arrayMidEnd.charArray.copyOfRange(arrayMidEnd.mid + 1, arrayMidEnd.end + 1),
                ((arrayMidEnd.end - arrayMidEnd.mid - 1) / 2),
                (arrayMidEnd.end - arrayMidEnd.mid - 1))
    }

    private fun getLeftArray(arrayMidEnd: ArrayMidEnd): ArrayMidEnd {
        return ArrayMidEnd(
                arrayMidEnd.charArray.copyOfRange(0, arrayMidEnd.mid + 1),
                (arrayMidEnd.mid / 2),
                arrayMidEnd.mid)
    }
}

data class ArrayMidEnd(val charArray: CharArray, val mid: Int, val end: Int)