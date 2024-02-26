class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        for(i in 0..t.length - p.length) {
            if(t.substring(i, i + p.length) <= p) {
                answer++
            }
        }

        return answer
    }
}