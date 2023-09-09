class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        // 1. survey_result를 저장할 맵 선언 / choices
        var survey_R = mutableMapOf<String, Int>("RT" to 0, "CF" to 0, "JM" to 0, "AN" to 0)
        
        // 2. choices -> score : 0 -> 3, 1 -> 3, 2 -> 1,  3 -> 0, 4 -> -1 / score == 3 - choices
        for((index, type) in survey.withIndex()) {
            if(choices[index] == 4) continue
            
            println("$type, ${choices[index]}")
            if(survey_R.containsKey(type)) {
                survey_R[type] = survey_R[type]!! + 4 - choices[index]
            } else {
                var typeArray = type.toCharArray()
                typeArray.reverse()
                val reverseType = String(typeArray)
                survey_R[reverseType] = survey_R[reverseType]!! + (choices[index] - 4)
                println("$type -> $reverseType")
            }
            println("$survey_R")
        }

        // 3. score >= 0이면 앞의 유형 else 뒤의 유형
        for ((key, score) in survey_R) {
            answer += if(score >= 0) key[0] else key[1]
        }
        println(survey_R)
        return answer
    }
}