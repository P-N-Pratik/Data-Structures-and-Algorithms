# class Test:
#     pass
# obj=Test
# print(obj)
# obj1=Test()
# print(obj1)
'''
class Test1:
    name="niraj"
    def __init__(self):
        self.name="Niraj"
obj=Test1
print(obj.name)
Test1.name="Mehariya"
obj2=Test1()
print(obj2.name) #method object
print(Test1.name) #class variable called
'''
class Person:
    def __init__(self,name,age):
        self.name= name 
        self.age = age
    def __str__(self) -> str:
        return f"{self.name}({self.age})"
    def assignValue(self,name,age):
        self.name=name
        self.age=age
    def printvalues(self):
        print(f"object name= {self.name}")
p1=Person("Niraj",21)
p2=p1
print(p1)
p1.assignValue("Mehariya",34)
p1.printvalues()
print(p1)
print(p2)

