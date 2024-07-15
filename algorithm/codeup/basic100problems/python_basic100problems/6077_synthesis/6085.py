w, h, b = map(int, input().split())

mb_size = w*h*b/8/1024/1024
print('%.2f'%mb_size, 'MB')