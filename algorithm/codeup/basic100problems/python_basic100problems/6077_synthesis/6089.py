a, r, n = map(int, input().split())

for _ in range(n-1):
    a*=r
print(a)