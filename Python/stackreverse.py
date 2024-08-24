from balancedparanthesis import *

def ReverseString():
    s=Stack()
    st=input("enter the string")

    for i in st:
        s.push(i)
        val=s.pop()
        for j in val:
            print(val,end="")

