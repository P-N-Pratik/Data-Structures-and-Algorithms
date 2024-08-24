def print_args(func):
    def inner_func(*args,**kwargs):
        print("Execution of the  multiply_nums started")
        return func(*args,**kwargs)
     #call the original function with its arguments.
    return inner_func
@print_args #by using decorators
def multiply_nums(a,b):
    return a*b
@print_args #by using decorators
def addition(a,b):
    return a+b
print(multiply_nums(10,20))
print(addition(10,20))
# test1=print_args(multiply_nums)
# print(type(test1(10,20)))
# print(test1(10,20))