# uA = [-3,9,0,21,44,58,94,73,17,-23,400,92,-90,326,125,398,200,0,18,9,94]
uA=[1,2,3,4,5,6,7]

def mergeSort(arr):
    if len(arr) < 2:
        return arr
    else:
        mid = len(arr)/2
        left = arr[:mid]
        right = arr[mid:]
        return merge(mergeSort(left), mergeSort(right))

def merge(left, right):
    result = []
    i = 0
    j = 0
    while i<len(left) and j<len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i+=1
        elif left[i] > right[j]:
            result.append(right[j])
            j+=1
    while i<len(left):
        result.append(left[i])
        i+=1
    while j<len(right):
        result.append(right[j])
        j+=1
    return result
  
print(mergeSort(uA))