class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = mutableListOf<Int>()
        val id_index = mutableMapOf<String, Int>()
        val flag_data = mutableMapOf<String, MutableSet<String>>()
        
        // 0. <id, index> 형태의 Map 셋업
        for((index, id) in id_list.withIndex()) {
            answer.add(0)
            id_index[id] = index
        }
        
        // 1. '키 : 신고당한사람', 'value : 신고한 사람들' 형태의 Map 셋업
        report.forEach {
            val (from, to) = it.split(" ")
            
            if (flag_data.containsKey(to)) { // 이미 존재하는 키인 경우
                flag_data[to]?.add(from) // 존재하지 않는 키인 경우
            } else {
                flag_data[to] = mutableSetOf(from)
            }
        }
        
        // 2. Map을 순회하며 value의 array.size > k 일때, answer에 ++후 반환
        for ((key, items) in flag_data) {
            if(items.size < k)
                continue
            
            for (item in items) {
                answer[id_index[item]!!]++
            }
        }
        return answer.toIntArray()
    }
}