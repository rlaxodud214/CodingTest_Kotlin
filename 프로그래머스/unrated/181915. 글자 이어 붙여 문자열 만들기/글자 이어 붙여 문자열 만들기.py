def solution(my_string, index_list):
    answer = [my_string[index] for index in index_list ]
    
    return ''.join(answer)