class Solution {
    val combinationNumbers = Array(3) { 0 }
    var nextInputIndex = 0

    val combinationGroup = mutableListOf<List<Int>>()
    lateinit var numbersBackup: IntArray

    fun solution(nums: IntArray): Int {
        // 1. 주어진 배열에서 3개씩 뽑는다.
        numbersBackup = nums
        combination(0, 0)

        // 2. 1차원 배열끼리 합한다. / 그 합한 수가 소수인지 판별한다.
        return combinationGroup.map { numbers -> numbers.sum() }
            .filter { sum -> isNotDecimal(sum) }
            .count()
    }

    fun combination(currentIndex: Int, depth: Int) {
        if (depth == goalDepth) {
            // println(combinationNumbers)
            combinationGroup.add(listOf(*combinationNumbers))
            return
        }

        for (i in currentIndex until numbersBackup.size) {
            combinationNumbers[nextInputIndex++] = (numbersBackup[i])
            combination(i + 1, depth + 1)
            combinationNumbers[--nextInputIndex] = 0
        }
    }

    fun isNotDecimal(num: Int): Boolean {
        val roofIndex = Math.sqrt(num.toDouble()).toInt()
        for (i in 2..roofIndex) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    companion object {
        val goalDepth = 3
    }
}