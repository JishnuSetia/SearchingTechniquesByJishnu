arr = [1,2,3,4,5,6,7,8,9]
print(arr)
toSearch = 9
low = 0
high = len(arr) - 1
while low <= high: 
    mid = int((low+high)/2)
    if arr[mid] == toSearch:
        print("Found")
        break
    if arr[mid]>toSearch:
        high = mid-1
    if arr[mid]<toSearch:
        low = mid+1
        