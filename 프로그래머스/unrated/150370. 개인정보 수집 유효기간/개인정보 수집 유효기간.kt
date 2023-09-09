class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var termsValues = mutableMapOf<String, Int>()
        var privaciesValues = mutableListOf<Int>()
        // 1. 2000.01.01 날짜를 기준으로 today, terms, privacies의 날짜 형식을 숫자로 변경한다.
        val (today_year, today_month, today_day) = today.split(".").map{ it.toInt() }
        val todayValue = (today_year-2000) * 12 * 28 + (today_month-1) * 28 + today_day-1
        
        terms.forEach {
            termsValues[it.split(" ")[0]] = it.split(" ")[1].toInt() * 28
        }
        
        privacies.forEach {
            val type:String = it.split(" ")[1]
            val (y, m, d) = it.split(" ")[0].split(".").map{ it.toInt() }
            // 날짜형식을 숫자로 변경하면서 type의 유효기간만큼 더하고 오늘 날짜를 뺀다.
            val privaciesValue = (y-2000) * 12 * 28 + (m-1) * 28 + d-1 + termsValues[type]!! - todayValue
            privaciesValues.add(privaciesValue)
        }
        // privaciesValues의 value가 0보다 작거나 같다면 유효기간 만료를 뜻한다.
        answer = privaciesValues.indices.filter { privaciesValues[it] <= 0 }.map {it + 1}.toIntArray()
        return answer
    }
}