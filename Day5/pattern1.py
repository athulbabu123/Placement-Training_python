# 0
# 1 1
# 2 4 8
# 15 19 46 88

# 3 5 6 7 9 10 11 12 13 14 16 17 18

# 0 1 1 2 4 8 15 19 46 88

def fib(n):
    if n == 0:
        return 0
    if n == 1 or n == 2:
        return 1
    if n == 3:
        return 2
    if n == 7:
        return 19
    while n > 0:
        return fib(n-1) + fib(n-2) + fib(n-3) + fib(n-4)

count = 0
for i in range(5):
    for j in range(i):
        if count > 7:
            print(fib(count)*-1,end=' ')
        else:
            print(fib(count),end=' ')
        count +=1
    print()


