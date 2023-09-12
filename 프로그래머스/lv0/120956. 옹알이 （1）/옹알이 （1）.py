from itertools import permutations


def solution(babbling):
    # "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
    # -> permutations 써서 순열 구하기
    basic_babblings = ["aya", "ye", "woo", "ma"]
    all_babblings = []
    for i in range(1, 5):
        perms = list(permutations(basic_babblings, i))

        for perm in perms:
            s = ''
            for element in perm:
                s += element
            all_babblings.append(s)

    print(all_babblings)
    result = [babb for babb in babbling if(babb in all_babblings) ]
    
    return len(result)