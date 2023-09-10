from operator import itemgetter

def solution(rank, attendance):
    # (등수, 몇 번 학생) 뽑기
    filtering = [(rank[index], index) for index, value in enumerate(attendance) if value == True]
    # 등수 기준 filtering 정렬 기준 : lambda x:x[0] or itemgetter(0)
    Sorted = [x[1] for x in sorted(filtering, key=lambda x:x[0])][:3]
    
    return Sorted[0]*10000 + Sorted[1]*100 + Sorted[2]