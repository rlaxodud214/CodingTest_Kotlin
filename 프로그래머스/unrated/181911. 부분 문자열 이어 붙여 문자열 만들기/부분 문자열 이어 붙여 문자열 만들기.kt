class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer = my_strings.mapIndexed { index, it -> 
            it.substring(parts[index][0], parts[index][1]+1)
        }.reduce { acc, s -> acc + s}
        return answer
    }
}