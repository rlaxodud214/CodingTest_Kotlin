class Solution {
    fun solution(s: String): String { // "try hello world"
        var answer = ""
        var words = s.split(" ").toMutableList() // try

        for ((index, str) in words.withIndex()) { // try
            var temp = ""
            
            for (idx in str.indices) {
                if (idx % 2 == 0) {
                    temp += str[idx].uppercaseChar()
                } else {
                    temp += str[idx].lowercaseChar()
                }
            }
            
            words[index] = temp
        }
        answer = words.joinToString(" ")
        return answer
    }
}