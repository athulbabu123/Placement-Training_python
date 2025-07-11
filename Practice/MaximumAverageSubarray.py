def maxAverage(nums):
    left = 0
    average = 0
        
    while left <= len(nums) - 4:
        print('left value is ',left)
        sumV = 0
        for i in range(left,left+4):
            print('value of i is ',i)
            print('element is ',nums[i])
            sumV += nums[i]
        print('sum value is ',sumV)
        newAverage = sumV / 4
        print('previous average is ',average)
        print('new Average is ',newAverage)
        average = max(average,newAverage)
        left += 1
    return average

nums = [1,12,-5,-6,50,3]

average = maxAverage(nums)
print(average)
