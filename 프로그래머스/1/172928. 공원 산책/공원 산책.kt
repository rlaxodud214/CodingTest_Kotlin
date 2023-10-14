class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        // 0. 공원의 최대 인덱스 구하기
        var (H, W) = intArrayOf(park.size, park[0].length)
        println("x : $H, y : $W")
        
        // 1. park에서 S 및 X들의 위치(좌표x-y)를 찾는다.
        var point = intArrayOf(-1, -1)
        var x = mutableListOf<String>()
        park.forEachIndexed { i, row ->
            row.mapIndexedNotNull { j, char ->
                if (char == 'S') {
                    point = intArrayOf(i, j) 
                }
                if (char == 'X') {
                    x.add("$i, $j") // 뒤에서 in으로 처리하기 위해 String으로 변경
                }
            }
        }
                
        // 2. routes를 순회하며 A), B) 인 경우 return -> 아니면 C) 수행
        println("처음 위치 : ${point.contentToString()}")
        routes.forEach { route ->
            var op:String = route.split(" ")[0]
            var n:Int = route.split(" ")[1].toInt()
            var newPoint = point
            var check = mutableListOf<String>()
 
            // A) 범위 벗어나면 return
            // B) 현재 좌표부터 route 적용된 좌표까지 인덱스를 routeArray 배열로 뽑는다.
            //    check와 x 간에 중복이 있으면 return
            // C) point 업데이트하기
            when (op) {
                "N" -> {
                    if(point[0] - n < 0)
                        return@forEach
                    
                    (1..n).map { i ->
                        check.add("${point[0] - i}, ${point[1]}")
                    }
                    check.map { it ->
                        if(it in x) 
                            return@forEach
                    }
                    
                    newPoint[0] = point[0] - n
                }
                "S" -> {
                    if(point[0] + n > H - 1)
                        return@forEach
                    
                    (1..n).map { i ->
                        check.add("${point[0] + i}, ${point[1]}")
                    }
                    println(check.joinToString(" 및 "))
                    check.map { it ->
                        if(it in x) 
                            return@forEach
                    }
                    
                    newPoint[0] = point[0] + n
                }
                "W" -> {
                    if(point[1] - n < 0)
                        return@forEach
                    
                    (1..n).map { i ->
                        check.add("${point[0]}, ${point[1] - i}")
                    }
                    check.map { it ->
                        if(it in x) 
                            return@forEach
                    }
                    
                    newPoint[1] = point[1] - n
                }
                "E" -> {
                    if(point[1] + n > W - 1)
                        return@forEach
                    
                    (1..n).map { i ->
                        check.add("${point[0]}, ${point[1] + i}")
                    }
                    check.map { it ->
                        if(it in x) 
                            return@forEach
                    }
                    
                    newPoint[1] = point[1] + n
                }
            }
            
            // C) A, B가 아닌 경우 point 업데이트하기
            point = newPoint
            println("위치 이동 : ${point.contentToString()}")
        }
        return point
    }
}

