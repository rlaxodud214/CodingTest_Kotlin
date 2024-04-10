class Solution {
    var numbers = mutableSetOf<Int>()

    fun solution(elements: IntArray): Int {
        for (i in 0..elements.size) {
            var sum = 0

            for (j in i until i + elements.size) {
                sum += elements[j % elements.size]
                numbers.add(sum)
            }
        }
        return numbers.size
    }
}