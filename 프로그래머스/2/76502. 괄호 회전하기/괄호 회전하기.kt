class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        // 1. 문자열 회전
        var sCopy = s
        var stack = mutableListOf<Char>()
        
        outer@ for (i in 0 until s.length) {
        	// 2. 스택을 통해 올바른 괄호인지 판단
            sCopy = sCopy.substring(1) + sCopy[0]
            
            for (ch in sCopy) {
                // 앞에 여는 괄호 없이 닫는 괄호가 온 경우
                if ( stack.size == 0 && ch in ")]}") {
                    continue@outer
                }
                
                when {
                    ch in "([{" -> stack.add(ch)
                    
                    ch in ")]}" -> {
                        // 페어가 불일치한 경우
                    	if (ch != pairs[stack.last()]) {
                            continue@outer
                        }
                        // 페어가 일치한 경우
                        stack.removeAt(stack.size - 1)
                    }
                }
            }
            
            if (stack.size == 0) {
                answer++
            }
        }
        
        return answer
    }
    
    companion object {
        var pairs = mapOf(
            '(' to ')',
            '{' to '}',
            '[' to ']',
        )
    }
}