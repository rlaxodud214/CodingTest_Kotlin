class Solution {
    var answer: Int = 0
    lateinit var numbers: IntArray
    var result = Array(3) { 0 }

    fun solution(number: IntArray): Int {
        numbers = number
        combination(0, 0)
        
        return answer
    }
    
    // 조합
    fun combination(index: Int, count: Int){
        if(count == 3) {
            if(result.sumOf{ it } == 0)
                answer += 1
            return
        }

        for(i in index until numbers.size){
            result[count] = numbers[i]
            combination(i + 1, count + 1)
        }
    }
}