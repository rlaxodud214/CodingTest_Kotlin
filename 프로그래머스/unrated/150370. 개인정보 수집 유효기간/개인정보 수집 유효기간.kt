class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var termsValues = mutableMapOf<String, Int>()
        var privaciesValues = mutableListOf<Int>()

        // 1. 2000.01.01 날짜를 기준으로 today, terms, privacies의 날짜 형식을 숫자로 변경한다.
        val todayValue = dateParser(today)
        
        terms.forEach {
            termsValues[it.split(" ")[0]] = it.split(" ")[1].toInt() * 28
        }
        
        privacies.forEach {
            val type:String = it.split(" ")[1]
            var privaciesValue = dateParser(it.split(" ")[0])
            // 날짜형식을 숫자로 변경하면서 type의 유효기간만큼 더하고 오늘 날짜를 뺀다.
            privaciesValues.add(privaciesValue + termsValues[type]!! - todayValue)
        }
        // privaciesValues의 value가 0보다 작거나 같다면 유효기간 만료를 뜻한다.
        answer = privaciesValues.indices.filter { privaciesValues[it] <= 0 }.map {it + 1}.toIntArray()
        return answer
    }
    // '다른 사람의 풀이 아이디어'
    // 2차례 사용할 dateParser 코드를 함수로 구현해서 코드 중복 제거
    /** 현재 날짜 정보를 Int형으로 바꿔주는 함수 */
    fun dateParser(info: String): Int {
        val (year, month, day) = info.split(".").map {it.toInt()}
        return (year - 2000) * (28*12) + month * 28 + day
    }
    // day 기준 int 변환이 아닌 month를 기준으로 변환하여 28진수 비교를 하는 코드도 있었음
}