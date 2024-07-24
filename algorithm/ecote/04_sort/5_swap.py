''' 두 배열의 원소 교체
- 설명
    두 개의 배열 A, B가 있음
    두 배열은 N개의 원소로 구성되어 있으며, 배열의 원소는 모두 자연수
    최대 K번의 바꿔치지 가능
        바꿔치기 : 배열 A 원소 하나와 B 원소 하나 서로 바꿈
    목표 : 배열 A의 모든 원소의 합이 최대가 되도록
    N, K, 배열 A, B 정보가 주어졌을 때, 
     최대 K번의 바꿔치기 연산을 수행하여 
     배열 A의 모든 원소의 합의 최댓값 출력
- 예) N=5, K=3, A=[1,2,5,4,3], B=[5,5,6,6,5]
    1. A 1, B 6 바꿈
    2. A 2, B 6 바꿈
    3. A 3, B 5 바꿈
    세 번의 연산 후 : A=[6,6,5,4,5], B=[3,5,1,2,5]
        이 때 A 원소 합=26
- 시간제한 2, 메모리 제한 128MB
- 입력 조건 : 1<=N<=100,000, 0<=k<=N, 모든 원소 < 10,000,000
5 3
1 2 5 4 3
5 5 6 6 5
'''

N, k = map(int, input().split())
arr = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

arr.sort()
arr2.sort()

print(arr)
print(arr2)

arr_idx = 0
arr2_idx = N-1

while True:
    if k <= 0:
        break
    print(arr[arr_idx], arr2[arr2_idx])
    if arr[arr_idx] < arr2[arr2_idx]:
        arr[arr_idx], arr2[arr2_idx] = arr2[arr2_idx], arr[arr_idx]
        k-=1
        arr_idx+=1
        arr2_idx-=1
        print(arr)
        print(arr2)

print(sum(arr))