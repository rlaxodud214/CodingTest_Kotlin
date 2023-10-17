class Solution {
    fun solution(x: Int): Boolean {
        var h = x.toString().map { it.toString().toInt() }.sumOf { it }
        return true.takeIf { x % h == 0 } ?: false
    }
}