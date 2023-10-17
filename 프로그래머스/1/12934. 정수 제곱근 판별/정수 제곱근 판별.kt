class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        (1L..n).forEach outer@{
            if (it*it == n)
                return (it+1) * (it+1)
            
            else if (it*it > n)
                return@outer
        }
        return -1L
    }
}