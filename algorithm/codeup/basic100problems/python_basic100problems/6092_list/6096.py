size = 19

d = [list(map(int, input().split())) for _ in range(size)]

n = int(input())
for _ in range(n):
    x,y=input().split()
    
    x = int(x)-1
    y = int(y)-1
    
    for j in range(size) :
        if d[j][y]==0 :
            d[j][y]=1
        else :
            d[j][y]=0

        if d[x][j]==0 :
            d[x][j]=1
        else :
            d[x][j]=0
        
        # pad[row][j] = 1 - pad[row][j]
        # pad[j][col] = 1 - pad[j][col]

for r in d:
    print(*r)