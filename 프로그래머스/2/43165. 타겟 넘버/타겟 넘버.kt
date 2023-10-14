class Solution {
    // DFS
    fun solution(numbers: IntArray, target: Int): Int {
        var temp = numbers.fold(listOf(0)) { list, i ->
            list.run {
                map { it + i } + map { it - i }
            }
        }
        // println(temp.joinToString(", "))
        return temp.count { it == target}
    }
}