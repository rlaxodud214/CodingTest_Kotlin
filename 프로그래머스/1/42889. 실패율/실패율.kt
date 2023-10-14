// class Solution {
//     fun solution(N: Int, stages: IntArray): IntArray {
//         var rates = mutableListOf<Pair<Int, Float>>()

//         // 1. N번 반복하면서 N회차 실패율을 failureRates에 넣기
//         for (i in 1..N) {
//             // N회차 실패율 = 값이 N인 사용자의 수 / 값이 N이상인 사용자의 수
//             val rate = (stages.count { it == i }).toFloat() / (stages.count { it >= i }).toFloat()
//             rates.add(Pair(i, rate))
//         }
//         /* 2. rates 정렬
//                 a. 실패율을 내림차순으로 정렬
//                 b. 실패율이 같다면 작은 번호의 스테이지가 먼저 오게 
//         */
        
//         // [2. a+b] compareBy(첫 번째 기준, 두 번째 기준)으로 실패율이 같을 경우, 스테이지 번호를 기준으로 정렬
//         return rates.sortedWith(compareBy({ -it.second }, { it.first })).map { (stage, _) -> stage }.toIntArray()
//     }
// }

// 자료형을 List 대신 Array로 선택했을 떄, 성능-메모리 차이 체크 -> 성능 2배 증가, 메모리 3MB 더 사용함 ??
class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val rates = Array<Pair<Int, Float>>(N) { Pair(0, 0.0f) }

        for (i in 1..N) {
            val rate = (stages.count { it == i }).toFloat() / (stages.count { it >= i }).toFloat()
            rates[i - 1] = Pair(i, rate)
        }

        return rates.sortedWith(compareBy({ -it.second }, { it.first })).map { (stage, _) -> stage }.toIntArray()
    }
}