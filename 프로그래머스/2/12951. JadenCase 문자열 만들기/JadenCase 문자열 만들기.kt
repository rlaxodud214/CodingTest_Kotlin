class Solution {
    fun solution(s: String): String {
        var answer = StringBuilder()

        for (word in s.split(" ")) {
            for (i in word.indices) {
                if (i == 0) {
                    if (word[i] in 'a'..'z') {
                        answer.append(word[i].uppercaseChar())
                    } else {
                        answer.append(word[i])
                    }
                    continue
                }

                answer.append(word[i].lowercaseChar())
            }
            answer.append(' ')
        }

        return answer.toString().dropLast(1)
    }
}