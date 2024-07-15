sum_criteria = int(input())

sum = 0
n = 0
while True:
    sum += n
    if (sum>=sum_criteria):
        break
    n+=1

print(n)