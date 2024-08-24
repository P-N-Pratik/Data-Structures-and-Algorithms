# def abc():
#     print("abc")

# abc()
# -----------------------------------------------------------
# def abc(*a,):
#     print("abc",a)

# abc(10,12,2,23,23,24,24,43,23,24,24,42,24,2,4,3,"nfkndf","hbhdifbjdsbf")
#-----------------------------------------------------------
# def abc(*a,**b):
#     print("abc",a,b)

# abc()
#--------------------------------------------------------------


# *a -> returns Tuple
#**a -> return dictionary
def abc(*a,**b):
    print("abc",a,b)

print(abc())