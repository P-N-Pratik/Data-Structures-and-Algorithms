s = "bcabcb"
k=3
n=len(s)
resString = ""
# for i in range(0,n):
#     print(i, " ",end=" ")
#     for j in range(i+1,n):
#         print(j,end=" ")
#     print(end="\n")

for i in range(0,n):
    counter = 1
    tempArr = []
    tempArr.append(s[i])
    tempString = s[i]
    for j in range(i+1,n):

        if(s[j] in tempArr):
            tempArr.append(s[j])
            tempString+=s[j]
        else:
            tempArr.append(s[j])
            tempString+=s[j]
            counter+=1
        
        if(counter == k):
            if(len(tempString) > len(resString)):
                resString=tempString
        
        if(counter > k):
            break

print(resString)