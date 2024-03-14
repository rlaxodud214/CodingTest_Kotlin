import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0

        // 1. 1부터 number까지 약수의 개수를 구한다.
        for (i in 0 until number) {
            val square = sqrt((i+1).toDouble())
            var count = 0

            for (j in 1..square.toInt()) { // 제곱근 까지 돌고 * 2
                if ((i+1) % j == 0) {
                    count += 2
                }
            }

            // num이 16인 경우, 4가 2번 카운트 되었으므로 -- 해줘야한다.
            // square가 정수인지 판단해야함 -> 소수점이 0인지 체크
            if (square - square.toInt() == 0.0) { //
                count--
            }

            // 2. limit를 넘으면 power를 아니면 count를 누적한다.
            answer += if(count > limit) power else count
        }

        return answer
    }
}