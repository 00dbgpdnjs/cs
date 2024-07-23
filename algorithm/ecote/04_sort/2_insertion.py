array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)-1): # i : i까지 상대 정렬됨
    for j in range(i, -1, -1):
        if array[j] <= array[j+1]:
            break
        else:
            array[j+1], array[j] = array[j], array[j+1]

print(array)