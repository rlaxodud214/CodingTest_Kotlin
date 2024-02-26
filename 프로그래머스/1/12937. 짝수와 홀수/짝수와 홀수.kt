import kotlin.math.*

class Solution {
    fun solution(num: Int): String {
        if(num == 0) {
            return "Even"
        }
        
        return if(abs(num) % 2 == 1) "Odd" else "Even"
    }
}