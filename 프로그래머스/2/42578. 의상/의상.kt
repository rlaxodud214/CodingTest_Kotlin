class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val codys = mutableMapOf<String, Int>()

        for ((name, type) in clothes) {
            val value = codys.getOrPut(type) { 0 }
            codys.put(type, value + 1)
        }

        println(codys)

        val answer = (codys.values).fold(1) { acc, count ->
            // 한 종류의 의류를 골라서 입거나(count), 아예 안 입거나(1)
            acc * (count + 1)
        }

        return answer - 1
    }
}