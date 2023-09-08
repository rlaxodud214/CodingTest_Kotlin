import java.util.*

class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        // 1) 일반 list 사용
//         val ranking = mutableListOf<Int>()
//         for(score in scores) {
//             // 1. 빈 배열에 k만큼 score 추가
//             if(ranking.size < k) {
//                 ranking.add(score)
//                 answer.add(ranking.minOrNull() ?: 0)
//                 continue
//             }
            
//             // 2. 다 채운 후) ranking의 최소값보다 크다면 score로 값 변경
//             val minvalue = ranking.minOrNull() ?: 0
//             if(score > minvalue) {
//                 ranking[ranking.indexOf(minvalue)] = score
//             }
//             answer.add(ranking.minOrNull() ?: 0)
//         }
        
        // '다른 사람의 풀이'에서 사용된 자료구조를 참고하여 코드 재구성
        // 2) 우선순위 큐는 작은 값이 앞에 있기 때문에 peek() 메소드를 사용하여 최소값 참조가 가능함
        // 시간 복잡도 측면에서 peek가 효율성이 좋음 / peek()는 O(1) minOrNull은 O(N) 이므로 
        val pq = PriorityQueue<Int>() // base : Min Heap
        for(score in scores) {
            // 1. 빈 큐에 k만큼 score 추가
            if(pq.size < k) {
                pq.add(score)
            }
            
            // 2. 다 채운 후) peek()값 보다 크다면 값 추가후 poll() 순서 관계없음
            else if(score > pq.peek()) {
                pq.add(score)
                pq.poll()
            }
            answer.add(pq.peek())
        }
        return answer.toIntArray()
    }
}