class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        // 0. 공원의 최대 인덱스 구하기
        var (H, W) = intArrayOf(park.size, park[0].length)
        
        // 1. park에서 S(출발점) 좌표 찾기
        var point = intArrayOf(-1, -1)
        park.forEachIndexed { i, row ->
            row.forEachIndexed { j, char ->
                if (char == 'S')
                    point = intArrayOf(i, j) 
            }
        }
                
        // 2. routes를 순회하며 A), B) 인 경우 return -> 아니면 C) 수행
        // println("처음 위치 : ${point.contentToString()}")
        routes.forEach { route ->
            val (op, nStr) = route.split(" ")
            val n = nStr.toInt() ?: 0
            val (x, y) = point
                        
            when (op) {
                "N" -> {
                    // A) 범위 벗어나면 return
                    if(x - n < 0)
                        return@forEach

                    // B) 현재 좌표부터 route 적용된 좌표까지 순회하며 X와 중복이 있으면 return
                    for (i in 1..n)
                        if(park[x - i][y] == 'X') 
                            return@forEach
                    
                    // C) point 업데이트하기
                    point[0] = x - n
                }
                "S" -> {
                    if(x + n >= H )
                        return@forEach
                    
                    for (i in 1..n)
                        if(park[x + i][y] == 'X') 
                            return@forEach
                    
                    point[0] = x + n
                }
                "W" -> {
                    if(y - n < 0)
                        return@forEach
                    
                    for (i in 1..n)
                        if(park[x][y - i] == 'X') 

                            return@forEach
                    
                    point[1] = y - n
                }
                "E" -> {
                    if(y + n >= W)
                        return@forEach
                    
                    for (i in 1..n)
                        if(park[x][y + i] == 'X')
                            return@forEach
                    
                    point[1] = y + n
                }
            }
            // println("위치 이동 : ${point.contentToString()}")
        }
        return point
    }
}