def solution(number):
    num_list = [int(x) for x in list(number)]
    return int(sum(num_list)%9)