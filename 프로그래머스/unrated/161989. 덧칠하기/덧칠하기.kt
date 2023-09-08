import kotlin.math.*

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var area = MutableList(n) {0}
        var answer: Int = 0
        
        for(idx in section.map { it - 1 }.toIntArray()) {
            area[idx] = 1
        }
        
        for(idx in section.map { it - 1 }.toIntArray()) {
            if(area[idx] == 1) {
                for(index in idx until min(idx+m, area.size))
                    area[index] = 0
                answer++
            }
        }
        return answer
    }
}