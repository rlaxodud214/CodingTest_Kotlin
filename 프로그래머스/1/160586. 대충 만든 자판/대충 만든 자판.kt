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
            }
        }
        print(map.toString())
        
        // 2. map을 이용해서 targets을 완성하는 최소값 합산하기
        targets.forEach {
            var ac = it.fold(0) { acc, ch -> 
                if (!map.containsKey(ch)) {
                    answer.add(-1)
                    return@forEach
                }
                acc + (map[ch] ?: 0)
            }
            if (ac == 0)
                answer.add(-1)
            else
                answer.add(ac)
        }
        return answer.toIntArray()
    }
}