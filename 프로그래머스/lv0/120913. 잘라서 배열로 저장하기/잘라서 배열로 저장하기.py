def solution(my_str, n):
    answer = []
    index = 0
    for i in range(int(len(my_str)/n)):
        context = my_str[index : index+n]
        answer.append(context)
        index += n
        
    if len(my_str[index:]) > 0:
        answer.append(my_str[index:])
        
    return answer