class Solution {
    fun solution(phone_number: String): String {
        val divIndex = phone_number.length - 4
        return "*".repeat(divIndex) + phone_number.takeLast(4)
    }
}