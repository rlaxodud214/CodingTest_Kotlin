def solution(my_string, queries):
    answer = my_string
    
    for s, e in queries:
        reverse = answer[s:e+1][::-1]
        answer = answer[:s] + reverse + answer[e+1:]
        
    return answer