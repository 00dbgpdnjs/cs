''' 오른쪽으로 움직이다가 벽을 만나면 아래쪽
'''

SIZE = 10
FEED_VAL = 2
maze = [list(map(int, input().split())) for _ in range(SIZE)]

curr_x = 1
curr_y = 1

while True:
    if maze[curr_x][curr_y] == FEED_VAL:
        maze[curr_x][curr_y] = 9
        break
        
    maze[curr_x][curr_y] = 9
    
    if maze[curr_x][curr_y+1]==1 and maze[curr_x+1][curr_y]==1:
        break
    elif maze[curr_x][curr_y+1] != 1:
        curr_y += 1
    else :
        curr_x += 1
        
for r in maze:
    print(*r)