class Solution {
    fun solution(a: Int, b: Int): String {
        var diffDate = -1
        
        for (i in 1 until a) {
            diffDate += months[i - 1]
        }
        diffDate += 5 + b
        
        return days[diffDate % 7]
    }

    companion object {
        var days = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        // 윤년의 일 수
        val months = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    }
}