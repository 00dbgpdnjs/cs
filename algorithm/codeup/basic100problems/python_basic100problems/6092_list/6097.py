HEIGHT, WIDTH = map(int, input().split())
STICK_NUM = int(input())

grids = [[0]*WIDTH for _ in range(HEIGHT)]

for _ in range(STICK_NUM):
    stick_len, is_col, x, y = map(int, input().split())
    
    x-=1
    y-=1
    
    if x>WIDTH or y>HEIGHT:
        continue

    if is_col:
        if stick_len > HEIGHT-x:
            stick_len = HEIGHT-x
        for i in range(stick_len):
            grids[x+i][y] = 1
    else:
        if stick_len > WIDTH-y:
            stick_len = WIDTH-y
        for i in range(stick_len):
            grids[x][y+i] = 1
    
    
for r in grids:
    print(*r)
        