h, b, c, s = map(int, input().split())

size_MB = h * b * c * s / 8 / 1024 / 1024
print('%.1f'%size_MB, 'MB')