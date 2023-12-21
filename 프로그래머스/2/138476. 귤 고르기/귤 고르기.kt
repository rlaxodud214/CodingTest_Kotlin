class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var count: Int = 0
        
        val groupByCounts = tangerine
            .groupBy { it }
            .mapValues { it.value.size }
            .values
            .sortedDescending()
              
        var sum = 0
        while (sum < k) {
            sum += groupByCounts[count]
            count++
        }
        
        return count
    }
}