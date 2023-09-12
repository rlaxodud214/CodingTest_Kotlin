def solution(s, skip, index):
    ss = [ord(x)-96 for x in s]         # 아스키 코드 값 변환
    
    for i in range(len(ss)):
        count = index
        while count != 0:

            if ss[i] == 26:
                ss[i] = 0
                
            if(chr(ss[i]+97) not in skip):  # 스킵이 아닌 경우
                count -= 1

            ss[i] += 1
            
    return "".join([chr(x+96) for x in ss])