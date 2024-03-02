class Solution {
    // reduce는 첫 번째 요소를 초기 acc값으로 사용하기 때문에 첫 번째 요소에 대한 조건 처리를 무시함
    // 이럴 때는, fold에 초기값 0을 지정하여 첫 번째 요소도 조건에 따라 누적되도록 하면 된다~
    fun solution(left: Int, right: Int): Int {
        return (left..right).fold(0) { acc, num ->
            val divCount = (1..num).filter { num % it == 0 }.count() // 약수의 개수

            (acc + num).takeIf { divCount % 2 == 0 } ?: (acc - num)
        }
    }
}