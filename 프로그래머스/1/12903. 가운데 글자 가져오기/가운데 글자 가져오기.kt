class Solution {
    fun solution(s: String): String {
        val middleIndex = s.length / 2
        val isOddLength = s.length % 2

        if (isOddLength == 1) {
            return middleChar(s, middleIndex)  
        }  
        return middleTwoChar(s, middleIndex)
    }
    // s의 길이가 홀수
    fun middleChar(s: String, middleIndex: Int) = s[middleIndex].toString() 
    // s의 길이가 짝수
    fun middleTwoChar(s: String, middleIndex: Int) = s.substring(middleIndex - 1, middleIndex + 1) 
}