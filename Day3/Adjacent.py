nums = [3,4,5,6,2,7]
target = int(input())

for i in range(len(nums)):
    if(nums[i] == target):
        index = i
        break;

if(index == 0):
    print(nums[index+1])
elif(index==len(nums)-1):
    print(nums[index-1])
else:
    print(nums[index-1])
    print(nums[index+1])
