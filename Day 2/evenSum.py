def evenSum(arr):
    sumValue = 0
    for num in arr:
        if num % 2 == 0:
            sumValue += num
    return sumValue

arr = [23,45,56,8,10]
print(evenSum(arr))
