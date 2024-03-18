class Solution {
    fun solution(X: String, Y: String): String {
        val numberCountX = MutableList(10) { 0 } // 0 ~ 9
        val numberCountY = MutableList(10) { 0 } // 0 ~ 9
        val commonNumberCount = MutableList(10) { 0 } // 0 ~ 9


        // 1. 공통으로 포함된 수를 뽑는다.
        for (chx in X) {
            for (chy in Y) {
                if (chx == chy) {
                    numberCountX[chx - '0']++
                    break
                }
            }
        }

        for (chy in Y) {
            for (chx in X) {
                if (chy == chx) {
                    numberCountY[chy - '0']++
                    break
                }
            }
        }

        for (i in commonNumberCount.indices) {
            commonNumberCount[i] = minOf(numberCountX[i], numberCountY[i])
        }

        if (commonNumberCount.all { it == 0 }) {
            return "-1"
        }

        var sb = StringBuilder()
        for ((index, value) in commonNumberCount.withIndex()) {
            if (value != 0) {
                repeat(value) {
                    sb.append(index)
                }
            }
        }

        // 시간이 많이 소요되는 부분 -> reversed()
        sb = sb.reversed() as StringBuilder
        val sbText = sb.toString()

        return if (sb.all { it == '0' }) "0" else sbText
    }
}