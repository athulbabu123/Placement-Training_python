heights = list(map(int,input().split()))


def findMaxCapacity(height):
    left = 0
    right = len(height) - 1
    maxCapacity = 0

    while(left < right):
        height = min(heights[left],heights[right])
        width = right - left
        maxCapacity = max(maxCapacity,height * width)
        if(heights[left] < heights[right]):
            left += 1
        else:
            right -= 1
    return maxCapacity

capacity = findMaxCapacity(heights)
print(capacity)
