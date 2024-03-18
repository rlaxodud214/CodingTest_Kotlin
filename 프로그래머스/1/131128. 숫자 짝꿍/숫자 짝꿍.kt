class Solution {
    fun solution(X: String, Y: String): String {
        val commonNumberCount = MutableList(10) { 0 } // 0 ~ 9

        // 1. 공통으로 포함된 수를 뽑는다.
        val xCountMap = X.groupingBy { it }.eachCount()
        val yCountMap = Y.groupingBy { it }.eachCount()

        for (i in commonNumberCount.indices) {
            val convertIndex = (48 + i).toChar()
            commonNumberCount[i] = minOf(xCountMap[convertIndex] ?: 0, yCountMap[convertIndex] ?: 0)
        }

        if (commonNumberCount.all { it == 0 }) {
            return "-1"
        }

        var sb = StringBuilder()
        for (i in 9 downTo 0) {
            if (commonNumberCount[i] != 0) {
                repeat(commonNumberCount[i]) {
                    sb.append(i)
                }
            }
        }

        val sbText = sb.toString()
        return if (sbText.all { it == '0' }) "0" else sbText
    }
}