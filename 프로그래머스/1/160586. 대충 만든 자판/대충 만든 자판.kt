class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        var map = mutableMapOf<Char, Int>()
        
        // 1. keymap을 이용해서 <"키패드" : 최소 누르는 횟수> 형태의 map 생성
        keymap.forEach { str ->
            // 키가 이미 있는 경우 최소값 유지하기
            str.forEachIndexed { index, ch ->
                if (!map.containsKey(ch)) {
                    map[ch] = index + 1
                }
                else if (map[ch]!! > index + 1) {
                    map[ch] = index + 1
                }    
                // [다른 사람 코드] 위 if, else if와 같은 코드 
                // minOf(기존 else if), "?:"(기존 if) 연산자를 사용함
                // map[ch] = minOf(map[ch] ?: 100, i + 1) 
            }
        }
        
        // 2. map을 이용해서 targets을 완성하는 최소값 합산하기
        // 다른 사람의 풀이 -> 아래처럼 "outer@"를 명시적으로 지칭할 수 있음!! + 이름 수정 가능함
        targets.forEach outer@{
            var ac = it.fold(0) { acc, ch -> 
                // ch가 map의 키값에 없다면 -1 추가하기
                if (!map.containsKey(ch)) {
                    answer.add(-1)
                    return@outer
                }
                acc + map[ch]!!
            }
            answer.add(ac)
        }
        return answer.toIntArray()
    }
}