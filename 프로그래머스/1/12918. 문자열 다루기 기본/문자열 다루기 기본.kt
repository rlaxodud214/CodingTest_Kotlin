class Solution {
    fun solution(s: String): Boolean {
        // s.length !in listOf(4, 6) -> listOf 생성과 in 연산자 사용 시, 8ms정도 추가됨
        if(s.length != 4 && s.length != 6) {
            return false    
        }
        
        return s.filter { it in '0'..'9' }.count() == s.length
    }
}