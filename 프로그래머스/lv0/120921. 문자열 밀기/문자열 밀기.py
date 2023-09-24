def solution(A, B):
    answer = 0
    text_left = A
    text_right = A
    
    if(A==B):
        return 0
    
    for i in range(len(A)):
        if text_left == B or text_right == B:
            break            
        answer += 1
        text_left = text_left[-1] + text_left[:-1]
        text_right = text_right[:-1] + text_right[-1]
        
    if len(A) == answer:
        answer = -1
    return answer