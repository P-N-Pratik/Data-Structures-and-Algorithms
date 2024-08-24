class Node:
    def __init__(self,data=0,next=None):
        self.data = data
        self.next = next
class LList:
    _lList=0
    def __init__(self):
        self.head=None
        self.countLenList()
    def addNode(self):
        newNode=Node()
        newNode.data=int(input("Enter the value to add at node: "))
        if not self.head:
            self.head=newNode
            return
        temp=self.head
        while(temp.next!=None):
            temp=temp.next
        temp.next=newNode
        newNode.next=None
        
    def addNodebeg(self):
        newNode=Node()
        newNode.data=int(input("Enter the value for node at beginning: "))
        if not self.head:
            self.head=newNode
            return
        newNode.next=self.head
        self.head=newNode
    def addNodeEnd(self):
        newNode=Node()
        newNode.data=int(input("Enter the value for node at end: "))
        if not self.head:
            self.head=newNode
            return
        temp=self.head
        while(temp.next!=None):
            temp=temp.next
        temp.next=newNode
        newNode.next=None

    def addBetween(self):
        newNode=Node()
        key=int(input("Enter the value after which you want to add node: "))
        temp=self.head
        while(temp):
            if(temp.data==key):
                newNode.data=int(input("Enter the value to be added in the node: "))
                nextnode=temp.next
                temp.next=newNode
                newNode.next=nextnode
                break
            temp=temp.next
    def sortNode(self):
        a=[]
        temp=self.head
        if(self.head==None):
            print("the list is empty")
        while(temp):
            a.append(temp.data)
            temp=temp.next
            print(a)
    def printList(self):
        print("List is: ")
        temp=self.head
        while(temp!=None):
            print(f'{temp.data}->',end="")
            temp=temp.next
        print("NULL")
    def countLenList(self):
        temp=self.head
        count=0
        while(temp!=None):
            temp=temp.next
            count+=1
        self._lList=count
        print(self._lList)
    def lenList(self):
        temp=self.head
        count=0
        while(temp!=None):
            temp=temp.next
            count+=1
        self._lList=count
        print(self._lList)

ll=LList()

while True:
    x=int(input("Select your choice 1.add node 2.add at start 3.add at last 4.add node in between 5.print 6.lenlist 7.sortnode  8.exit: "))

    if(x==1):
        ll.addNode()
        ll.printList()
    elif(x==2):
        ll.addNodebeg()
        ll.printList()
    elif(x==3):
        ll.addNodeEnd()
        ll.printList()
    elif(x==4):
        ll.addBetween()
        ll.printList()
    elif(x==5):
        ll.printList()
    elif(x==6):
        ll.lenList()
        ll.printList()
    elif(x==7):
        ll.sortNode()
        ll.printList()
    elif(x==8):
        exit()
    else:
        print("enter the valid choice")
#implment is palindrome functionality using linked list  1 2 2 1 or "MADAM"
#find the given arraay is palinarray or not [122,222,234] -false as 234 is not palindrom