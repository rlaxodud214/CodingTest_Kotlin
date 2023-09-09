import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        val numbers = mutableListOf(a, b, c, d)
        
        when(numbers.toSet().size) {
            1 -> answer = 1111 * numbers[0] // 1)
            2 -> {
                when(numbers.groupingBy{it}.eachCount().filter { it.value % 2 == 0 }.keys.toList().size) {
                    0 -> { // 2) 3, 1
                        val p = numbers.groupingBy{it}.eachCount().filter { it.value == 3 }.keys.toList()[0]
                        val q = numbers.groupingBy{it}.eachCount().filter { it.value == 1 }.keys.toList()[0]
                        answer = (10*p+q).toDouble().pow(2).toInt()
                    }
                    2 -> { // 2) 2, 2
                        val numbers_set = numbers.distinct()
                        answer = (numbers_set[0]+numbers_set[1]) * abs(numbers_set[0]-numbers_set[1]) // 3
                    }
                }
            }
            3 -> { // 4
                val (p, q) = numbers.groupingBy{it}.eachCount().filter { it.value == 1 }.keys.toList()
                answer = p * q
            }
            4 -> answer = numbers.sorted()[0] // 5
        }
        return answer
    }
}