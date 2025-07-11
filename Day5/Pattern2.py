# 1,2,6,-7,24,-26,120,-121,720,-722,...

def fact(n):
    if n == 1 or n == 0:
        return 1
    while n > 0:
        return n * fact(n-1)
negative = True
count = 0

for i in range(1,7):
    if i > 2:
        print(fact(i),end=' ')
        if count == 0:
            if negative:
                print((fact(i)+1)*-1,end=' ')
            else:
                print(fact(i)+1,end=' ')
            count = 2
        elif count == 2:
            if negative:
                print((fact(i)+2)*-1,end=' ')
            else:
                print(fact(i)+2,end=' ')
            count = 0
    else:
        print(fact(i),end=' ')
