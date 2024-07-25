# arr = [5, 1, 7, 3, 6, 4, 8, 9, 0]
arr = [0, 5, 7, 8]

# 재귀적 구현
def binary_search(arr, target, start, end):
    if start > end:
        return None
    mid = (start+end)//2
    if arr[mid] == target:
        return mid
    elif arr[mid] < target:
        return binary_search(arr, target, mid+1, end)
    else:
        return binary_search(arr, target, start, mid-1)

# 반복문
def binary_search(arr, target, start, end):
    while True:
        if start > end:
            return None
        mid = (start + end) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            start = mid+1
        else:
            end = mid-1

target = 7
arr.sort()
res = binary_search(arr, target, 0, len(arr)-1)
if res == None:
    print("존재x")
else:
    print(res)