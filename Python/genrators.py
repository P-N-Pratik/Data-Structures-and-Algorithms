# def genCubes(n):
#     for i in range(n):
#         yield i**3
# for i in genCubes(10):
#     print(i)
 
#  def genAlpha(ch):
#     if ord(ch) in range(ord("a"),ord("z")+1):
#         for ch in range(ord("a"),ord(ch)+1):
#             yield chr(ch)

#     elif ord(ch) in range(ord("A"),ord("Z")+1):
#         for ch in range(ord("A"),ord(ch)+1):
#             yield chr(ch)


# for i in genAlpha(input()):
#     print(i)

# def genAlpha(start=0,end=0,update=1):
#     if start and not end:
#         start,end=end,start
#     elif not start:
#         print("no yield")
#     # if(type(start)!=type(str())):
#     #     start=str(start)    
#     if(type(end)==type(str())):
#         if end.isupper():
#             start="A"
#         else:
#             start="a"  
#     while(start<=end):
#         yield start
#         if(type(start)==type(str())):
#             t=ord(start)+update
#             start=chr(t)
#         else:
#             start+=update

# for i in genAlpha(input()):
#     print(i)

#create a genrator that yield "n" number between low and high number that are input

import random
def rand_num(low,high,n):
    while(n>0):
        num =random.randint(low,high)
        yield num
        n-=1
for num in rand_num(11,30,12):
    print(num)