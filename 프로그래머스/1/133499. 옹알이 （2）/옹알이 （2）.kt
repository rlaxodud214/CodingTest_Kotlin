class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0

        for (i in babbling.indices) outer@ {
            val convertText = canSpeak.foldIndexed(babbling[i]) { index, acc, key ->
                acc.replace(key, (index).toString())
            }

            if (convertText.any { it !in '0'..'3' }) {
                continue
            }

            var isContinue = false
            for (j in 1 until convertText.length) {
                if (convertText[j - 1] == convertText[j]) {
                    isContinue = true
                    break
                }
            }

            if (isContinue == true) {
                continue
            }
            answer++
        }

        return answer
    }
    
    companion object {
        val canSpeak = listOf("aya", "ye", "woo", "ma")
    }
}