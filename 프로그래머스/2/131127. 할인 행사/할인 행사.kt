class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0

        var countByProduct = (0 until want.size).associate {
            want[it] to number[it]
        }

        var countByDiscount = (0 until want.size).associate {
            want[it] to 0
        }.toMutableMap()

        for (i in discount.indices) {
            for (j in i until minOf(discount.size, i + 10)) {
                val name = discount[j]
                countByDiscount[name] = countByDiscount.getOrPut(name) { 0 }.plus(1)
            }

            var isEnough = true
            for (k in 0 until countByProduct.size) {
                val key = want[k]
                if (countByProduct[key]!! > countByDiscount[key]!!) {
                    isEnough = false
                }
            }

            if (isEnough) {
                answer++
            }

            countByDiscount.keys.forEach {
                countByDiscount[it] = 0
            }
        }


        return answer
    }
}