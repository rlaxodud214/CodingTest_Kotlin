import kotlin.math.*

class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        var answer: Long = 0
        
        // A.zip(B)는 A, B 순서로 2개의 배열을 병합하며, 크기는 min(A.size, B.size)이다.
        // mapIndexedNotNull : 각 항목을 변환하면서 인덱스도 제공
        var idps = deliveries.zip(pickups).mapIndexedNotNull{
            index, (d, p) -> if(d > 0 || p > 0) Triple(index+1, d, p) else null
        }
        var deliverie = 0
        var pickup = 0
        
        // 먼 곳부터 배달해야하기 때문에 .reversed() 사용 
        for((distance, d, p) in idps.reversed()) {
            deliverie += d
            pickup += p
            
            while(deliverie > 0 || pickup > 0) {
                deliverie -= cap
                pickup -= cap
                answer += distance * 2
            }
        }
        
        return answer
    }
}