class Solution {
    fun solution(phone_number: String): String {
        var div = phone_number.length - 4
        return "*".repeat(div) + phone_number.substring(div)
    }
}