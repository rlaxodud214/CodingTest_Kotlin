def solution(dartResult):
    match = {"S": 1, "D":2, "T":3}
    last_option = ""
    score = []
    
    for dart in dartResult:
        for ch in dart:
            print("전", ch, score, end = "\t\t")
            # 숫자인지 판별
            if ch.isdigit():
                if ch == '0' and len(score) > 0 and score[-1] == 1:
                    score[-1] = 10
                else:
                    score.append(int(ch))
                    
                last_option = ""
            
            # 알파벳 대문자
            elif ch.isalpha() and ch.isupper():
                score[-1] = score[-1] ** match[ch]
                last_option = ""
                
            #옵션1 *
            elif ch == '*':
                score[-1] *= 2
                if len(score) > 1:
                    score[-2] *= 2
                last_option = '*'
                
            #옵션1 #
            elif ch == '#':
                if last_option == '*':
                    score[-1] *= -2
                else:
                    score[-1] *= -1
                    
                last_option = '#'
                
            print("후", ch, score)
            
    return sum(score)

'''
	"3D*3T#3D*" +9 -27 + 9 = -9
    9 * 2
'''