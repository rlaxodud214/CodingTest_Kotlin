class Solution {
    // 다른 사람의 아이디어를 이해한 뒤, 재구현 했습니다.
    val measureCount = IntArray(100_000) { 0 }
    
    init {
        // i가 2일때, 모든 2의 배수에 + 1 (약수의 개수 + 1)
        for (i in 0..measureCount.size) {
            for (j in i until measureCount.size step(i + 1)) {
                measureCount[j]++
            }
        }
    }
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0

        for (i in 0 until number) {
            answer += if (measureCount[i] > limit) power else measureCount[i]
        }

        return answer
    }
}