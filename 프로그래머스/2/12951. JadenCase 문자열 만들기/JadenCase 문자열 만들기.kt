class Solution {
    fun solution(s: String): String {
        var answer = StringBuilder()
        val words = s.split(" ")

        for (word in words) {
            // 공백이 이어서 들어온 경우를 처리한다.
            if(word.length == 0) {
                answer.append(" ")
                continue
            }
            
            // 단어의 첫 문자를 처리한다.
            if (word[0] in 'a'..'z') {
                answer.append(word[0].uppercaseChar())
            } else {
                answer.append(word[0])
            }

            // 나머지 단어를 처리한다.
            val lastWord = word.drop(1)
            answer.append(lastWord.toLowerCase(), ' ')
        }

        return answer.toString().dropLast(1)
    }
}