import kotlin.math.*

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
//         var area = MutableList(n) {0}
        
//         for(idx in section.map { it - 1 }.toIntArray()) {
//             area[idx] = 1
//         }
        
//         for(idx in section.map { it - 1 }.toIntArray()) {
//             if(area[idx] == 1) {
//                 for(index in idx until min(idx+m, area.size))
//                     area[index] = 0
//                 answer++
//             }
//         }
        
        // '다른 사람의 풀이'
        var nextSection = 0
        section.forEach {        
            if (it >= nextSection) {
                answer++
                nextSection = it + m
            }
        }
        // 느낀점 : 시각적으로 생각해서 굳이 배열을 만들고 색칠을 할 필요가 없다
        // 생각을 바꾸자 / nextSection으로부터 m만큼 칠한다. -> m만큼 더한다.
        
        return answer
    }
}