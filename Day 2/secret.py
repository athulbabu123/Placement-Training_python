import random

def setSecretKey(password):
    specialCharacters = ['!','@','#','$','%','^','&','*']
    secretKey = []
    for i in range(8):
        if i % 2 == 1:
            secretKey.append(random.choice(specialCharacters))
        else:
            secretKey.append(password[i])
    return ''.join(secretKey)

def validate(password,userPassword):
    for i in range(8):
        if i % 2 == 0:
            if password[i] != userPassword[i]:
                return False
    return True

password = input("Enter password ")
if len(password) != 8:
    print("Password must be 8 letters long")
else:
    secretLock = setSecretKey(password)
    print("The secured password is ",secretLock)
    userPassword = input("Enter secret key ")
    if len(userPassword) != 8:
        print("password must be 8 letters long")
    elif validate(secretLock,userPassword):
        print("Correct secret Key")
        print("The correct password is ",password)
    else:
        print("Incorrect secret key")
