class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) {
            return intArrayOf(-1)
        }

        val minValue = arr.minOf { it }

        return arr.filter { it != minValue }.toIntArray()
    }
}