# size = 19

d = [[0 for j in range(19)] for i in range(19)]

# d = np.zeros((19, 19), dtype=int)

# d = [[0] * 19 for _ in range(19)]

# d=[]  
# for i in range(20) :
#     d.append([])
#     for j in range(20) : 
#         d[i].append(0)

n = int(input())
for i in range(n) :
    x, y = input().split()
    d[int(x)-1][int(y)-1] = 1

# for i in range(1, 20) :
#   for j in range(1, 20) : 
#     print(d[i][j], end=' ')    #공백을 두고 한 줄로 출력
#   print()        
for i in range(0, 19) :
    print(*d[i])