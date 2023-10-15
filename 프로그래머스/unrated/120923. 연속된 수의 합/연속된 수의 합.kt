class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var baseNumber = total / num // 중심값
        var diff = (num-1) / 2 // 차이값
        
        // 나머지가 0인 경우 그 값을 중심으로 좌우에 num - 1 만큼 배열 만들어서 리턴
        if(total % num == 0)
            answer = (baseNumber - diff..baseNumber + diff).toList().toIntArray()
            
        else if(total % num != 0)
            answer = (baseNumber - diff..baseNumber + diff + 1).toList().toIntArray()
        
        return answer
    }
}