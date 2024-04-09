class Solution {
    var answer = 0

    fun solution(n: Int, a: Int, b: Int): Int {
        var next = Next(minOf(a, b), maxOf(a, b))

        while (next.b != next.a) {
            next.a = (next.a + 1) / 2
            next.b = (next.b + 1) / 2
            answer++
        }
        
        return answer
    }
}

data class Next(
    var a: Int = 0,
    var b: Int = 0
)