array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

def simple_quick_sort(array):
    if len(array) <= 1:
        return array
    pivot = array[0]
    tail = array[1:]
    
    left = [elem for elem in tail if elem <= pivot]
    right = [elem for elem in tail if elem > pivot]
    
    return simple_quick_sort(left) + [pivot] + simple_quick_sort(right)

print(simple_quick_sort(array))