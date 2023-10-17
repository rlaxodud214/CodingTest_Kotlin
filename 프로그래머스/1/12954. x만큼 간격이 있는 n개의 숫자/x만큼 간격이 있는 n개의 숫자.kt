class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n) { 0L }
        
        (0 until n).forEachIndexed { idx, i ->
            answer[idx] = x*(1+i.toLong()).toLong()
        }
        
        return answer
    }
}