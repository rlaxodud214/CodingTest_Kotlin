def solution(cap, n, deliveries, pickups):
    # 같은 로직일 때, Kotlin(65ms)과 시간차이 체크
    
    idps = [(i, d, p) for i, (d, p) in enumerate(zip(deliveries, pickups), 1) if d or p]
    deliverie = 0
    pickup = 0
    answer = 0
        
    for distance, d, p in idps[::-1]:
        deliverie += d
        pickup += p

        while deliverie > 0 or pickup > 0:
            deliverie -= cap
            pickup -= cap
            answer += distance * 2
        
    return answer