n = ord(input())- ord('A') + 10

for i in range(1, 16):
    print('%X'%n, '*%X'%i, '=%X'%(n*i), sep='')
    
''' 다른 사람
a = int(input(), 16)

for i in range(1, 16):
    print("%X*%X=%X" %(a, i, a*i))
'''