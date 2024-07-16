n = int(input())
lst = list(map(int, input().split()))

# for i in range(n-1, -1, -1):
#     print(lst[i], end=' ')

print(*lst[::-1])