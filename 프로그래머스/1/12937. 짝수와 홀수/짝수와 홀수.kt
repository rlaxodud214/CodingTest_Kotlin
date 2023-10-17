class Solution {
    fun solution(num: Int): String {
        println(5 % 2 == 1)
        
        if(num == 0)
            return "Even"
        else if(num < 0)
            return "Odd".takeIf{(num * -1) % 2 == 1} ?: "Even"
        else
            return "Odd".takeIf{num % 2 == 1} ?: "Even"
    }
}