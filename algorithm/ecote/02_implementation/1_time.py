''' 시각
- 문제 설명
    정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의
    모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수 구하기
- 시간제한 2초, 메모리 제한 128MB
- 입력 조건 : 정수 N (0~23)
- ex) 5 -> 11475
'''
N = int(input())
cnt = 0
for h in range(N+1): # 52 32 53 33
    is_3 = True if (h//10==3) or (h%10==3) else False
    if is_3:
        cnt = cnt + (60*60)
        continue
    for m in range(60):
        is_3 = True if (m//10==3) or (m%10==3) else False
        if is_3:
            cnt = cnt + 60
            continue
        for s in range(60):
            is_3 = True if (s//10==3) or (s%10==3) else False
            if is_3:
                cnt += 1
            
print(cnt)