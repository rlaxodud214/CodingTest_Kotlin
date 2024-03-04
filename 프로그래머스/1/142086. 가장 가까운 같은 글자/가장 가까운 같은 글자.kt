class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(s.length) { -1 } // -1 default 값 지정
        var nearIndex = mutableMapOf<Char, Int>()

        for ((index, ch) in s.withIndex()) {
            if(nearIndex.containsKey(ch)) {
                answer[index] =  index - nearIndex[ch]!!
            }
            nearIndex[ch] = index
        }
        return answer
    }
}