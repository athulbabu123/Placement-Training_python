def sumOfArray(arr):
    sumValue = 0
    for num in arr:
        sumValue += num
    return sumValue

arr = [244,7672,76,262,78]
arraySum = sumOfArray(arr)
print(arraySum)
