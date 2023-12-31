class Solution {
    // 카탈랑 수 : 이진 트리의 수를 셀 때 등장하는 수열
    fun solution(n: Int): Int { // DP - 바텀업
        var answer = 0
        /*
        n = 1) () 1
        n = 2) (()), ()() 2
        n = 3) (()()), ((())), (())(), ()()(), ())(()) 5
        
        어떻게 하든 처음에 '('로 시작해서 마지막엔 ')'로 끝나야 하기 때문에
        4개의 쌍을 가지고 만든다고 했을때 처음과 끝을 생각하면 3개의 쌍으로 만든다고 생각하면 될까?    
        
        기존의 dp[3]을 v라고 하면 
        "()   v  ", "(  v   )", "   v  ()" 형태
        "()((()))", "(((())))", "((()))()",
        "()(()())", "((()()))", "(()())()“
        "()(())()", "((())())", "(())()()“
        "()()(())", "(()(()))",    중복
            중복   , "(()()())", "()()()()"
        "(())(())“
        
        카탈랑의 수 점화식을 사용하여 문제 해결
        dp[n+1] = 2(2n+1)/(n+2) * dp[n]
        dp[n] = 2(2n-1)/(n+1) * dp[n-1]
              = (4n-2)/(n+1) * dp[n-1]
        */
        
        // 다른 사람의 풀이 n == 4로 디버깅
        // 느낀점 : 메모이제이션으로 dp를 백업하며 바텀업을 쓰는 게 시간상 매우 빠르다.
        val dp = Array(n + 1) { 0 }
        dp[0] = 1
        dp[1] = 1
        
        // 정리된 점화식 공식
        for(i in 1..n) {
            dp[i] = ((4.0*i-2) / (i+1) * dp[i-1]).toInt()
            // println(dp.contentToString())
        }
        
        /* 점화식 베이스
        for (i in 2..n)     // i = 2   / 3       / 4          / 5
            for (j in 1..i) // j = 1,2 / 1, 2, 3 / 1, 2, 3, 4 / 1, 2, 3, 4, 5
                dp[i] += dp[j - 1] * dp[i - j]
                /* dp[2] += dp[0] * dp[1] 
                          + dp[1] * dp[0] / dp[2] += 1 + 1 / dp[2] = 2
                          
                   dp[3] += dp[0] * dp[2] 
                          + dp[1] * dp[1]
                          + dp[2] * dp[0] / dp[3] += 2 + 1 + 2 / dp[3] = 5
                */
        */
        return dp[n]
    }
}