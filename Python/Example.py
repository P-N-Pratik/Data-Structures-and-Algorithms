import sys

# a=2
# print(sys.getsizeof(a))
#
# --------------------------------------------------
# weight = int(input("Enetr the weight"))
#
# if(weight%2==0 and weight!=2):
#     print("yes")
# else :
#     print("no")
# ----------------------------------------------


# noOfDoors = int(input("Enter the NUmber of Doors"))
# noOfStudents =[noOfDoors]
#
# for i in noOfStudents :
#     noOfStudents[i]="x"
#
# for i in range(0,noOfStudents.length+1):
#     for i in noOfStudents :
#         if(i==1):
#             for i in range(1,noOfStudents.length+1):
#                 noOfStudents[i]=="y"
#
#         elif(i%2==0):
#             if(noOfStudents[i]=="x"):
#                 noOfStudents[i]="Y"
#             else:
#                 noOfStudents[i]="x"
#
#
# closeDoors=0
# for i in range (1,noOfStudents.length+1):
#     if(noOfStudents[i]=="x"):
#         closeDoors+=1
#-------------------------------------------------------------------
'''ternary operator is not allowed in python '''

# age = 20
# print("Adult" if age>=18 else "junior")
#
# -----------------------------------------------
#
# list1 = [2,4,6,8,9]
# list2=[]
# for i in list1:
#     result_mapping=["Odd","Even"]
#     result=result_mapping[i%2==0]
#
#     if(result=="Even"):
#         list2.append(i)
#
# print(list2)
#
# -----------------------------------------------------------


'''
1. eval 
2. split() function



eval works with only numeric datatypes.and does not works for the string 
'''
# a=eval(input())
# print(a,type(a))
#
# print(eval("3*4+(5-2)"))

 #----------------------------------------



'''
How to take multiple inputs,
it gets stored in the list type and its the string function so the values will be stored in the string form.so access each element using the list methods to access elements.
the number passed in the split function as the parameter will result in ignoring that number and appending the rest of the numbers in the list in the string form.
'''

# a=input().split()
# print(a)
#
# print(int(a[1])+int(a[2]))
#
#


''' Splitting and typecasting at once'''
# a = [i for i  in input().split()]
# print(a)
#
# a = [int(i) for i  in input().split()]
# print(a)




'''Keyword in python'''

# import keyword
# print(keyword.kwlist)
# print(len(keyword.kwlist))




'''DataTypes in Python'''



'''Strings'''

'''#  The double quotes and single quotes is considered as String'''
# str = "SnowBall"
# print(str,type(str))

# str = 'SnowBall'
# print(str,type(str))



'''# using the comment line and assigning it to the variable will make it string.'''
# str = '''SnowBall'''
# print(str,type(str))




'''Only two Operators can be used while playing with the strings'''
# str = "SnowBall"
# print(str,type(str))
# print(str + " HEllo")
# print(str*3)





'''Printing the patterns'''

# print("* "*1)
# print("* "*2)
# print("* "*3)
# print("* "*4)




'''Slicing[strat_index:stop_index:step_counter(default=1)]'''

# str = '''SnowBall'''
# print(str[2:4])
# print(str[3:10])




'''Check the Given String is Palindrome or not'''

# a=input("Enter the String")
# if(a[::1] == a[::-1]):
#     print("Is Palindrome")
# else:
#     print("Not a Palindrome")




'''In one line'''

# print("yes" if a==a[::-1] else "NO")



'''If else Statements'''




'''Write a program to check the equilateral triangle'''

# write the program Afterwards





'''WAP '''

# n =int(input("Enter the Berth Number :"))
# seatvalue =(n%8)
# if(seatvalue == 1 or seatvalue == 4):
#     print("LB")
# elif(seatvalue == 2 or seatvalue == 5):
#     print("MB")
# elif(seatvalue == 3 or seatvalue == 6):
#     print("UB")
# else :
#     if(seatvalue == 7):
#         print("SLB")
#     else :
#         print("SUB")


'''To calculate electricity bill based on givem information(different slabs and rate per unit in each slab),read current month reading and previous month reading and compute number of units .
1 to 100 units  = 2/unit'''

# (100*2)+(150*3)(250*4)(500*5)



'''if else condition using ternary operator'''

# n=102
# print({True:"YEs",False :"NO"}[n>100])
# print(("no","yes")[n>100])  # Bydefault ("false","true")


'''Pyhton membership operators(in,not in)'''
'''left side object is a member in the right-side sequence or not'''

# print("a" in "sowbarnika")
# print("W" in "sowbarnika")
# print("W" not in "sowbarnika")
# print(100 not in [20,30,10,40,100])

''' Question (input : 9 || output : one digit number)'''

# if a in range(0,100):  Alsothis can be used

# a=int(input("ENter the number"))
# if(a>=0 and a<10):
#     print("onedigit number")
# elif(a>=10 and a<100):
#     print("two digit nnumber")
# elif(a>=100 and a<1000):
#     print("three digit number")
# else:
#     print("four digit number or more")


''' WAP To print whether the number is lowercase alpha or uppercase alpha or number or character'''

# if ord(a) in range(65,91): Also this can be used


# n=(input("Enter anything"))
# print(ord("n"))
# a=(ord(n))
# if a in range(65,91):
#     print("UpperCase Alphabet")
# elif a in range(97,123):
#     print("LowerCase")
# elif a in range(48,58):
#     print("Number")
# else:
#     print("Anything else or character")


'''WAP to calculate dogs age in dogs years.
note : for the first two years, a dog year is equal to 10.5 human years
After that eacg each dog year equals 4 human years.
inputs a dogs age in human years: 15'''

# a=int(input())

# if a<=0:
#     print("the age must be positive number ")
# elif a<=2:
#     a=a*10.5
# else:
#     a=(a-2)*4+21

# print(a)


'''looping statements(for loop ,while loop)'''

# a=int(input())
# for i in range(1,a+1):
#     print("* "*i)
    
    
''' Inverted Triangle'''

# a=int(input())
# for i in range(0,a):
#     print("* "*(a-i))

'''Diamond'''

# a=int(input()) # 3

# for i in range(0,a):
#     for j in range(0,(a-i-1)):
#         print(" ",end="")
#     for k in range(0,(i*2)+1):
#         print("*",end="")

#     print("\n")

# for i in range(0,(a-1)):
#     for j in range(0,(i+1)):
#         print(" ",end="")
#     for k in range(0,((a*2-1)-((i+1)*2))):
#         print("*",end="")
#     print("\n")


# To avoid the statement to go into the next line use the end="" parameter.
        




   

'''WAP return the length of the maximum continuous sequence of '0's '''

# a=input().split("1")
# print(a)
# print(len(max(a)))


'''Box'''

# a=int(input())
# for i in range(0,a):
#     if(i==0 or i==a-1):
#         print("# "*a)
#     else:
#         print("# "+"  "*(a-2)+"# ")
        

'''Wap that returns TRUE if the binary string can be rearranged to alternate01 strings else FALSE'''



'''for loop (iterating any sequence)'''
       

# for i in "sowbarnika":
#     print(i,end="")
#     print(i)


# for i in "sowbarnika":
#     if i in "AEIOUaeiou":
#         pass
#     else:
#         print()

   

'''Reaad a string and calculate the percentage of vowels'''

# a=input("")
# count=0
# for i in a:
#     if i in "AEIOUaeiou":
#         count+=1
# result=(count/len(a))*100
# print(result,"%")

#  #or

# a=input("")
# for i in a:
#     if i in "AEIOUaeiou":
#         b.append(i)
# result=(len(b)/len(a))*100
# print(result,"%")

''''''


'''format() (To format the output)'''
'''Area of the circle'''

# pi=3.14
# r=12.5
# area = pi*r**2

# print("Area :",area)
# import math
# area1 = math.pi*r**2
# print("Area1 :{:.2f}".format(area1))  # that means the value in the variable (area1) will be stored in the :.2f telling that we want to print only 2 values after the decimal point.
# print("Area of the circle with radius {} is : {:.4f}".format(r,area1))  # Here the r will be stored in the {} and the (area1) will be stored in the :.4f
# print(math.pi)
                   
# a,b=100,200
# print("sum of {} + {} = {}".format(a,b,(a+b)))


''' input binary then print yes else no'''

# a= input()
# b=[]
# c=[]
# for i in a:
#     if(i=='1' ):
#         b.append(i)
#     elif(i=='0'):
#         c.append(i)

# print(len(b))
# print(len(c))
# if(len(b)%2==0 and len(c)%2==0):
#     print("yes")
# else:
#     print("no")



#     # or



# s = input()
# ctzero,ctone = 0,0
# for i in s:
#     if i == '0':
#         ctzero += 1
#     else:
#         ctone += 1
# if ctzero == ctone or ctzero - 1 == ctone or ctone - 1 == ctzero:
#     print("yes")
# else:
#     print("no")



# or



# bin_num = input("Enter in Binaries")
# zeros ,ones =bin_num.count('0'),bin_num.count('1')
# if(abs(zeros-ones)>1):
#     print(False)
# else :
#     print(True)


''''''

# decimal=(input())
# binary=bin(int(decimal))[2:]
# binpalin=False
# decipalin=False

# if(decimal[::1]==decimal[::-1] ):
#     print("Decimal palindrome")
#     decipalin=True
# else :
#     print(" Decimal not a palindrome")
# # print("palindrome" if decimal[::1]==decimal[::-1] else "Not a Palindrome")

# if(binary[::1]==binary[::-1]):
#     print(" Binary palindrome")
#     binpalin=True
# else:
#     print("Binary not a palindrome")



# if(decipalin==True and binpalin==True):
#     print("Both are Palindrome")
# elif(decipalin==True and binpalin==False):
#     print("Only Decimal")
# elif(decipalin==False and binpalin==True):
#     print("Only Binary")
# else:
#     print("Not both of them")


#or
    
# a = input()
# b= True if a == a[::-1] else False
# a = (bin(int(a)))[2:]
# print("Binary and decimal " if a==a[::-1] and b else "binary" if a==a[::-1] else "decimal" if b else "niether")


'''WAp'''

# n=int(input("Enter numbe of days!.."))
# if n<=32:
#     ans=0
# elif n<=40:
#     ans=(n-32)*325
# elif n<=48:
#     ans=(n-40)*550+8*325
# else:
#     ans=(n-48)*600+8*550+8*325
# print(ans)


'''WAP'''
# a=input()

# for i in a :
#     if ord(i) in range(48,58) :
#         print("All Numbers are  Integer")
#     else:
#         print("All nummbers are not Integer")

#or

      
# text = input("Enter a string: ")
# text.strip()
# if len(text) < 1:
#     print("Enter valid text!")
# elif all(text[i] in "0123456789" for i in range(len(text))):
#     print("The string is an integer")
# else:
#     print("The string isn't an integer")




'''WAP '''


# inpu=int(input())
# list1=[inpu]
# for i in range(0,inpu):
#     a=input("Enter the Value in the index")
#     list1.append(a)

# if(len(list1)<=2):
#     for i in range(0,2):
#         print(list1[i],"online")
# elif(len(list1)>2):
#     for i in range(0,2):
#         print(list1[i],"ONline" ,(len(list1)-2),"More Online")


'''WAp'''
# count=0
# a=int(input())
# b=int(input())
# while(a>b):
#     print(a/2)
#     a=(a/2)
#     count+=1

# print("count :",count)



'''WAP'''



    

# def funct(a):
#     count=0
#     for i in a:
#         if(count==0):
#             print(i)
#             count=1


# a=input("Enetr the String")
# funct(a);

'''WAP recognize all the integers in the sequence of strings containing all the characters, alphas and numbers and sort the numbers in the descending order but keeping them in their same index'''

# a=input("Enter the String : ")
# print(a)
# for i in range(0,len(a)):
#     if(ord(a[i]) in range(48,58)):
#         max=i
        
#         for j in range(i+1,len(a)):
#             if(ord(a[j]) in range(48,58)):
#                 if(int(a[j])>int(a[max])):
#                     max=j

#         if(max != i):

#             temp=a[max]
#             a=a.replace(a[max],a[i],1)
#             a=a.replace(a[i],temp,1)



#             # tempi=a[i]
#             # maxtemp=a[max]
#             # a=a.replace(tempi,maxtemp)
#             # a=a.replace(maxtemp,tempi)

  
#             # a[i]=a[max]
#             # a[max]=temp


# print(a)
# ------------------------------------------------------------
1234
# str  = "abc"
# print(str[0])
# str.replace(str=str[0],str=str[2])
# print(str)      


# array=[input().split()]
# a="1234"
# for i in range(1,len(a)):
#     print(a[i])
    



#   for i in array:
#     if(ord(array[i]) in range(48,58)):
#         max=i
#         for j in range(i+1,array.length):
#             if(ord(j) in range(48,58)):
#                 if(array[j]>array[i]):
#                     max=j
        
#         if(max!=i):
#             temp=array[i]
#             array[i]=array[max]
#             array[max]=temp


        
'''Strings are Mutable or immutable that totally depends upon the progrsmming language for eg : In C language its allowed to update the string.'''

'''String Inbuilt Functions'''
'''capitalize()'''

# a="string"
# print(a.capitalize())  # capitalizes the first letter of the String
# print(a.title()) # capitalizes the first letter of Each word in the Sentence\
# print(a.center(12,"*"))   # returns string with length width,padded with fillchar
# print(a.ljust(12,'#'))
# print(a.rjust(12,'-'))
# print(a.zfill(12))  # zero fill ,no fill char allowed


'''count(sub,start,end)-> returns count of substring from start to end function '''

# a="This is python, py is VHLL"
# print(a.count("is"))
# print(a.count("is",2))
# print(a.count("is",2,10))
# print("Banana".count("ana"))  # 1 is the output, coz not able to find the overlapping substring.

'''WAP to consider with overlapping substring also'''

# string="aaaaa"
# leng=len(string)
# print(leng)
# subString="aa"
# substringlength=len(subString)
# for i in range(0,leng):
#     print(string.count(subString,i,substringlength+i))

# or
    # count=0
    # for i in range(0,leng):
    #     if(string.count(subString,i,substringlength+i)):
    #         count+=1


    
    
'''endsWith(suffix[,start][,end])-> returns true if the given string end with specialised suffix'''


# a="Hello"
# b="on"
# print(a.endsWith(b))

'''find(str,start,end) returns index if the specified string found,otehrwise returns 1'''


# a="Hello python"
# print(a.find("yth"))
# print(a.find("yth",10)) # starting from the particular index specified.
# print(a.find("yth",12))


'''isalpha() and isdigit() and isalnum() and isspace()->must be atleast one space and swapcase()->converts upper to lower case and vice versa.'''

s="Happy New year"
print(s.isalpha())

s="HappyNewyear"
print(s.isalpha())

print(s.isdigit())


print(s.isalnum())

print(s.isspace())


'''WAP password checking'''

# password=input("Enter the Password : ")
# condition=True
# if(len(password) in range (8,17)):
#     for i in range (0,len(password)):
#         if(password[i].isalpha()):
#             alp=True
            
#         elif(password[i].isdigit()):
#             digi=True
#         elif(password[i].isalnum):
#             alnu=True
#         elif(password[i].isspace()):
#             spa=True
#         elif(ord(password[i]) in range(65,91)):
#             up=True
#         elif(ord(password[i]) in range(97,123)):
#             lowerCase=True
#         elif(ord(password[i]) in range (58,65)):
#             charac=True
#         else:
#             condition=False

#             if()


# if(condition==True):
#     print("Strong Password")
# else:
#     print("Firse Daal")
# ---------------------------> Need to be Modified (The Above One)

# or



# WAP to check if a password is strong or not

# password=input()
# uc = lc = dc = sc = 0
# if len(password) in range(8,17):
#     for i in password:
#         if i.isupper():
#             uc+=1
#         elif i.islower():
#             lc+=1
#         elif i.isdigit():
#             dc+=1
#         else:
#             sc+=1
#     if uc>=1 and lc>=1 and dc >=1 and sc>=1:
#         print("Strong Password")
#     else:
#         print("Weak Password")
# else:
#     print("Password lenght between 8-16")
# print(f"UC:{uc}, LC:{lc}, DC:{dc} and SC:{sc}")




''' join() '''


# a=["P","Y","T","H","O","N"]
# b="-"
# print(b.join(a))
# print("hai ".join("Sowbarnika"))

# a=["P","Y","T","H","O","N"]
# print(b.join(a))


'''strip() and lstrip() and rstrip()'''

a = "******This is Pythno :*******"

print(a.strip("*"))
print(a.lstrip())
print(a.rstrip())


# ----------------------------------------------------> The NextCodes are forwaded to NewExample.ipynb.


