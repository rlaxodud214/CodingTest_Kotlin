class Solution {
    fun solution(num: Int): Int {
        var numAsLong = num.toLong()
        
        for (i in 0..499) {
            if (numAsLong == 1L)
                return i
            
            print("$numAsLong  -> ")
            
            numAsLong = numAsLong.Collatz()                       
        }
        
        return -1
    }
    
    fun Long.Collatz() = if (this % 2 == 0L) this / 2 else this * 3 + 1
}