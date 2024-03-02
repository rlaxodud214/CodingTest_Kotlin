import java.util.*

class Solution {
    fun solution(s: String) = String(s.toCharArray().sortedByDescending { it.code }.toCharArray())
}