import kotlin.math.*

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer = mutableListOf(wallpaper.size, wallpaper[0].length, 0, 0)
        
        for(x in wallpaper.indices) {
            for(y in wallpaper[x].indices) {
                if(wallpaper[x][y] == '.')
                    continue
                
                // if(answer[0] > x)
                //     answer[0] = x
                // if(answer[1] > y)
                //     answer[1] = y
                // if(answer[2] <= x)
                //     answer[2] = x+1
                // if(answer[3] <= y)
                //     answer[3] = y+1
                
                answer[0] = min(x, answer[0])
                answer[1] = min(y, answer[1])
                answer[2] = max(x, answer[2])
                answer[3] = max(y, answer[3])
            }
        }
        answer[2]++
        answer[3]++
        return answer.toIntArray()
    }
}