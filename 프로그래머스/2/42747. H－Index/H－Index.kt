import java.util.*

class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        citations.forEach {
            pq.add(it)
        }
        
        for (index in pq.indices) {
            if (pq.poll() >= index + 1) {
                answer = index + 1
            }
        }

        return answer
    }
}