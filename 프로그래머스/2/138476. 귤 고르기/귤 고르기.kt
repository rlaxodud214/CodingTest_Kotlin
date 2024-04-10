import java.util.*

class Solution {
    /**
     * 한 상자에 담으려는 귤의 개수 k    1 ≤ k ≤ tangerine의 길이 ≤ 100,000
     * 귤의 크기를 담은 배열 tangerine  1 ≤ tangerine의 원소 ≤ 10,000,000
     */
    fun solution(k: Int, tangerine: IntArray): Int {
        // 1. tangerine에서 각 요소의 개수를 뽑는다. -> 내림차순으로 정렬 -> 시간 오래 걸릴 듯
        val numCounts = IntArray(10_000_001) { 0 }

        for (i in tangerine) {
            numCounts[i]++
        }

        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        numCounts.forEach {
            if (it != 0) {
                pq.add(it)
            }
        }

        // 2. 요소의 개수를 더하다가 K보다 커지면 종료
        var count: Int = 0
        var sum = 0

        while (!pq.isEmpty()) {
            if (sum >= k) {
                return count
            }
            count++
            sum += pq.poll() // 항상 최대값
        }

        return count
    }
}