class Solution {
    fun solution(x: Int): Boolean {
        var h = x.toString().map { it.toString().toInt() }.sum()
        return if (x % h == 0) true else false
    }
}