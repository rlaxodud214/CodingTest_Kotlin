class Solution {
    fun solution(num: Int): Int {
        if( num == 1) 
            return 0
        
        var number = num.toLong()
        
        for (i in 1..500) {
            print("$number  -> ")
            
            if ( number % 2 == 0L )
                number /= 2

            else 
                number = number * 3 + 1
            
            if ( number == 1L )
                return i
        }
        // 느낀점 : 자리수가 크면 연산 시, 오버플로우로 데이터에 손실이 생길 수 있음 
        //         -> Long으로 적절히 변환해서 사용할 것!
        return -1
    }
}