import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val counts = MutableList(number) { 0 }
        
        // 1. 1부터 number까지 약수의 개수를 구한다.
        for (i in counts.indices) {
            counts[i] = measureCount(i + 1)
        }

        // 2. counts를 순회하며 limit를 넘는지 판단한다.
        counts.forEachIndexed { index, i ->
            // 2-1. limit를 넘으면 counts[i]를 power 값으로 바꾼다.
            if (i > limit) {
                counts[index] = power
            }
        }

        // 3. 변환된 counts의 sum을 반환한다.
        return counts.sum()
    }

    fun measureCount(num: Int): Int {
        val square = sqrt(num.toDouble())

        var count = 0
        for (i in 1..square.toInt()) { // 제곱근 까지 돌고 * 2
            if (num % i == 0) {
                count += 2
            }
        }

        // num이 16인 경우, 4가 2번 카운트 되었으므로 -- 해줘야한다.
        // square가 정수인지 판단해야함 -> 소수점이 0인지 체크
        if (square - square.toInt() == 0.0) { //
            count--
        }

        return count
    }
}