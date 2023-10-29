class Solution {
    fun solution(s: String): String {
        var answer = s.split(" ")
            .map(String::toInt)
            .sorted()

        return "${answer.first()} ${answer.last()}"
    }
}