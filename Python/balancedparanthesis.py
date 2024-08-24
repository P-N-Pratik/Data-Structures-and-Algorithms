# Balanced paranthesiss are those where open and closing bracket are same "(())" not eqaul in ")(()"

class Stack:
    def __init__(self,l=None,top=0,bottom=0):
        self.top=top
        self.bottom=bottom
        self.l=l if l is not None else []
    
    def push(self):
        if(len(self.l)%2==0):
            if(self.l[0]==")"):
                print("not valid paranthisis")
            else:
                self.l.append("(")
                self.top+=1
        else:
            print("paranthesis not valid") 
    
    def pop(self):
        if(self.l==")"):
            self.l.pop() 
            self.top-=1
            if(self.l.top==0):
                print("paranthesis ar eqaul or balanced")

ob=Stack("(())")
ob.push()
print(ob.l)
ob.pop()
print(ob.l)