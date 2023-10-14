class Solution {
    // 그리디
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        
        // 1. 매개변수 3개를 이용 -> 학생이 보유한 체육복의 수를 값으로 하는 배열 만들기
        var storageA = IntArray(n + 1) { 1 } // n + 1개 생성, 0번은 빈자리로 채워서 No 맞추기
        reserve.forEach { i -> storageA[i] = 2 }
        lost.forEach { i -> storageA[i] -= 1 } // lost가 도난 당한 경우 포함
        var storageB = storageA.copyOf() // CaseB를 위함
        
        // 2. reserve를 순회하며 좌-우에 lost가 있는지 파악하고 체육복 전달하기
        reserve.forEach { i -> 
            if(storageA[i] != 2)
                return@forEach // continue
            
            // A. 앞번호 학생에게 먼저 주는 경우
            if (storageA[i-1] == 0) {
                storageA[i-1] = 1
                storageA[i] = 1
            }
            else if (i < n && storageA[i+1] == 0) {
                storageA[i+1] = 1
                storageA[i] = 1
            }
            
            // B. 뒷번호 학생에게 먼저 주는 경우
            if (i < n && storageB[i+1] == 0) {
                storageB[i+1] = 1
                storageB[i] = 1
            }
            else if (storageB[i-1] == 0) {
                storageB[i-1] = 1
                storageB[i] = 1
            }
        }
        
        // 3. 체육 수업을 들을 수 있는 학생의 수 = n(전체 학생의 수) - 체육복의 수가 여전히 0인 학생의 수
        var zeroCount = minOf(lost.count{ i -> storageA[i] == 0 }, lost.count{ i -> storageB[i] == 0 })
        return answer - zeroCount
    }
}