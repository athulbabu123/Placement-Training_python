def isRepeating(num,nums):
    count = 0
    for i in range(len(nums)):
        if nums[i] == num:
            count += 1
    if count > 1:
        return True
    return False

def nonRepeating(nums):
    for num in nums:
        if isRepeating(num,nums):
            continue
        else:
            return num
    return -1

nums = [4,3,2,1,3,4,5,6,7,7,6]
nonRepeatingNumber = nonRepeating(nums)
if nonRepeatingNumber == -1:
    print('Every element repeats more than once')
else:
    print(nonRepeatingNumber)
    

        
