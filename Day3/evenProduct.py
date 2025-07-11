nums = list(map(int,input().split()))

def evenProductValue(nums):
    product = 1
    for num in nums:
        if num % 2 == 0:
            product = product * num
    return product

product = evenProductValue(nums)
print(product)
