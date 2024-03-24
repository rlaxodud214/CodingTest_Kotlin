class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var result_info = listOf("RT", "CF", "JM", "AN")
        var result = IntArray(4) { 0 }

        for ((index, value) in survey.withIndex()) {
            if (choices[index] == 4) {
                continue
            }

            var typeNumber = result_info.indexOf(value)

            if (typeNumber != -1) {
                result[typeNumber] += (4 - choices[index])
            } else {
                typeNumber = result_info.indexOf(value.reversed())
                result[typeNumber] -= (4 - choices[index])
            }
        }

        var sb = StringBuilder()

        for (i in result.indices) {
            val chooseCharIndex = if (result[i] >= 0) 0 else 1 
            sb.append(result_info[i][chooseCharIndex])
        }

        return sb.toString()
    }
}