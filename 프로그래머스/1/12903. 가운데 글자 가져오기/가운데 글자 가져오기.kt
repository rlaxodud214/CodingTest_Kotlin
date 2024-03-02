class Solution {
    fun solution(s: String): String {
        val isOdd = s.length % 2 == 1
        val midIndex = s.length / 2

        return if(isOdd) {
            s.substring(midIndex, midIndex + 1)
        } else {
            s.substring(midIndex - 1, midIndex + 1)  
        } 
    }
}