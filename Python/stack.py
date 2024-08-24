# n=int(input())
# l=[]
# max=10
# top=0
# bottom=0
# def puspstack(n):
#     # if top!=bottom:
#     #     l.append(n)
#     #     top+=1
#     # else:
#     #    print("stack overflow")
#     if top==max:
#         print("stack is full")
#         return
#     l.append(n)
#     top+=1
            
# def popstack(n):
#     # if (top==bottom):
#     #     print("stack is underflow u cant pop")
#     # else:
#     #     top-=1
#     #     for i in range(max):
#     #         l.pop(n)
#     if top==bottom:
#         print("stack is empty")
#         return
#     print(f"{l[top-1]} is poped out")
#     top-=1
# def printstack():
#     if not l:
#         print("stack is empty")
#         return
#     for i in range(top-1,-1,-1):
#         print(l[i])
# printstack()
# puspstack()
# puspstack()
# puspstack()
# printstack()
# popstack()
    
class stack:
    list=[]
    def __init__(self,max):
        self.top=0
        self.bottom=0
        self.max=5
    def pushstack(self):
        if self.top==self.max:
            return  f"stack is overflow"
        elif(self.top!=self.max):
            self.top+=1
            stack.list.append()
    def popstack(self):
        if self.top==self.bottom:
            return f"stack is underflow"
        elif (self.top!=self.bottom):
            self.top-=1
            stack.list.pop()
    def printstack(self):
        print("stack = ")
        print(stack.list)
p=stack(4)
p.pushstack()
p.pushstack()
p.pushstack()
    
