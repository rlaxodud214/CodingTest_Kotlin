class Solution {
    fun solution(s: String): String {
        return s.toCharArray()
            .sortedByDescending { 
                it.code 
            }.joinToString("")
    }
}