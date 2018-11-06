package buble

/**
 * Created by btow on 06.11.2018.
 */
class Buble(var charArray: CharArray) {

    fun getSortedArray() : CharArray {
        val end = charArray.size - 1
        for (i in end downTo 1) {
            for (j in 1..i)
                if (charArray[j - 1] > charArray[j]){
                    val temp = charArray[j]
                    charArray[j] = charArray[j - 1]
                    charArray[j - 1] = temp
                }
        }
        return charArray
    }
}