import java.util.PriorityQueue

class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        val answer = IntArray(scores.size)
        val pq = PriorityQueue<Int>() // base : min Heap

        // PriorityQueue는 peek() 값이 최소값으로 collection.min() 함수를 쓰는 것 보다 효율이 좋다
        // peek() = O(1), min() = O(N)
        for((index, score) in scores.withIndex()) {
            if(pq.size < k) {
                pq.add(score)
            }

            else if(score > pq.peek()) {
                pq.add(score)
                pq.poll()
            }

            answer[index] = pq.peek()
        }

        return answer
    }
}
