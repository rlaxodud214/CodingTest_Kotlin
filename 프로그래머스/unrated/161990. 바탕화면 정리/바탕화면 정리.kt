class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer = mutableListOf(wallpaper.size, wallpaper[0].length, 0, 0)
        
        for((x, wall) in wallpaper.withIndex()) {
            for((y, char) in wall.withIndex()) {
                if(char == '.')
                    continue
                
                if(answer[0] > x)
                    answer[0] = x
                if(answer[1] > y)
                    answer[1] = y
                if(answer[2] <= x)
                    answer[2] = x+1
                if(answer[3] <= y)
                    answer[3] = y+1
            }
        }
        return answer.toIntArray()
    }
}