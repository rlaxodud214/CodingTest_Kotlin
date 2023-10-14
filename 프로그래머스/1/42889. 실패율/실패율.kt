class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var failureRates = mutableListOf<Pair<Int, Float>>()

        // 1. N번 반복하면서 N회차 실패율을 failureRates에 넣기
        for (i in 1..N) {
            // N회차 실패율 : 값이 N이하인 사용자의 수 / 값이 N이상인 사용자의 수
            val failureRate = (stages.count { it == i }).toFloat() / (stages.count { it >= i }).toFloat()
            failureRates.add(Pair(i, failureRate))
        }
        
        print(failureRates)
        /* 2. failureRates를 기반으로 answer 정렬하기
                a. 실패율을 내림차순으로 정렬
                b. 실패율이 같다면 작은 번호의 스테이지가 먼저 오게 
        */
        failureRates = failureRates.sortedWith(compareBy({ -it.second }, { it.first })).toMutableList()
        val temp = failureRates.map { pair -> pair.first }.toIntArray()
        return temp 
    }
}