def search(nums,target):
    for num in nums:
        if num == target:
            return num
    return -1

arr = [2,3,4,56,76,345]
target = 56
print(search(arr,target))


