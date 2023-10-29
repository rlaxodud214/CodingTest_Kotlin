class Solution {
    fun solution(n: Int): Long {
        return when(n) {
            1 -> 1L
            2 -> 2L
            else -> {
                (3..n).fold(Pair(1L, 2L)) { acc, _ ->
                    val (first, second) = acc
                    Pair(second, (first + second) % 1234567)
                }.second
            }
        }
    }
}