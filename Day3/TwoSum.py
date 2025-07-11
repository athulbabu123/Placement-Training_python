nums = [1,2,3,4,5,6]
target = 5
start = 0
end = len(nums)-1


for i in range(0,len(nums)):
    if(nums[start] + nums[end] > target):
        end -= 1
    elif(nums[start] + nums[end] < target):
        start += 1
    else:
        print(start,end);
        break;
