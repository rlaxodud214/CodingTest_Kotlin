class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        return arr.toMutableList().filter { it % divisor == 0 }.sorted()
            .takeIf { it.isNotEmpty() }?.toIntArray() ?: intArrayOf(-1)
    }
}