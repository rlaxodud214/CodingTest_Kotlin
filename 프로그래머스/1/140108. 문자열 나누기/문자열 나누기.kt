class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var count = IntArray(2) { 0 }
        var baseC = ""
        
        s.forEach { ch ->
            var str = ch.toString()
            
            // baseC가 비어있는 경우
            if (baseC == "") {
                baseC = str
                count[0]++
            }
            
            // baseC와 같은 경우
            else if (baseC == str) {
                count[0]++
            }
            
            // baseC와 다른 경우
            else if (baseC != str) {
                count[1]++
            }
            
            // 초기화
            if (count[0] == count[1]) {
                answer++
                baseC = ""
                count = IntArray(2) { 0 }
            }
        }
        
        if(baseC != "")
            answer++
    
        return answer
    }
}