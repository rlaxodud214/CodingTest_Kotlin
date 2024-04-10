class Solution {
    fun solution(citations: IntArray): Int {
        var desSorted = citations.sortedArrayDescending()
        var answer = 0
        
        for(idx in citations.indices) { // 0, 1, 2, 3, 4
            if(desSorted[idx] >= idx+1) {
                answer = idx+1
            }
        }
        
        return answer
    }
}