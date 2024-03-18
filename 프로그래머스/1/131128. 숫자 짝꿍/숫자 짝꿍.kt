data class dt(val keyWord: String, val time: Long)

class Solution {
    fun solution(X: String, Y: String): String {
        // time 절약의 핵심 : MutableList to IntArray
        val numberCountX = IntArray(10) { 0 } // 0 ~ 9
        val numberCountY = IntArray(10) { 0 } // 0 ~ 9
        val commonNumberCount = IntArray(10) { 0 } // 0 ~ 9

        // 1. 공통으로 포함된 수를 뽑는다.
        for (chx in X) {
            numberCountX[chx - '0']++
        }
        for (chy in Y) {
            numberCountY[chy - '0']++
        }

        for (i in commonNumberCount.indices) {
            commonNumberCount[i] = minOf(numberCountX[i], numberCountY[i])
        }

        if (commonNumberCount.all { it == 0 }) {
            return "-1"
        }

        var sb = StringBuilder()
        for (i in 9 downTo 0) {
            if (commonNumberCount[i] != 0) {
                sb.append(i.toString().repeat(commonNumberCount[i]))
            }
        }

        val sbText = sb.toString()
        val temp = if (sbText.all { it == '0' }) "0" else sbText

        return temp
    }
}