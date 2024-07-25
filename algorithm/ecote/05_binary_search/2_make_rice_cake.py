''' 떡볶이 떡 만들기
- 설명
    떡 길이 일정x
    대신 한 봉지 안에 들어가는 떡 총 길이는 절단기로 잘라서 맞춰줌
    절단기에 높이(H)를 지정하면 줄지어진 떡을 한 번에 절단
    높이가 H보다 긴 떡은 H 위의 부분이 잘릴 것이고, 낮은 떡은 잘리지x
    ex) 높이가 19, 14, 10, 17 cm 인 떡이 나란히 있고
        절다닉 높이를 15cm로 지정하면
        자른 뒤 떡 높이는 15, 14, 10, 15
        잘린 떡의 길이는 4, 0, 0, 2
        손님은 6 cm 만큼의 길이를 가져감
    손님이 요청한 총 길이가 M일 때 적어도 M만킄의 떡을 얻기 위해
        절단기에 설정할 수 있는 높이의 최댓값은?
- 시간제한 2초, 메모리 제한 128MB
- 입력 조건: 떡 개수 N, 요청한 떡 길이 M (1<=N<=1,000,000, 1<=M<=2,000,000,000)
    떡 높이의 총합은 항상 M 이상므로, 손님이 필요한 양만큼 떡 사갈 수 있음
    높이 : 10억보다 작거나 같은 양수 정수 또는 0
    4 6
    19 15 10 17
    답 : 15
'''
import math
from random import randint
import time

# N, M = map(int, input().split())
# arr = list(map(int, input().split()))
N = 1000000
M = 100000
arr = []
for _ in range(1000000):
	arr.append(randint(1, 2000000000)) # 1~100

start_time = time.time()


arr.sort()
height_idx = len(arr)-2
# res = math.inf

while(height_idx>=0):
    # print("height_idx:", height_idx)
    sum = 0
    for i in range(len(arr)-1, height_idx, -1):
        if arr[height_idx] >= arr[i]:
            break
        sum += arr[i]-arr[height_idx]
    if M <= sum:
        # print("M:", M, ", sum:", sum)
        break
    else:
        height_idx-=1
        
print(arr[height_idx])
'''


start = 0
end = max(arr)

result = 0
while(start<=end):
	total = 0
	mid = (start + end) // 2
	for x in arr:
		if x > mid:
			total += x - mid
	# 떡의 양이 부족한 경우 더 많이 자르기 (왼쪽 부분 탐색)
	if total < M:
		end = mid - 1
	else:
		result = mid
		start = mid + 1
		
print(result)	
'''

end_time = time.time()
print(end_time - start_time)