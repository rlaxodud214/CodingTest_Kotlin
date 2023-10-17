class Solution {
    fun solution(x: Int, n: Int): LongArray {
        return LongArray(n) { x.toLong() * (1 + it) }
    }
}