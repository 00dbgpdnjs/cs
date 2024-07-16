n = int(input())
lst = list(map(int, input().split()))

# min = float('inf')
# for i in range(n):
#     if min > lst[i]:
#         min = lst[i]
# print(min)

print(min(lst)) # C언어로 구현됨