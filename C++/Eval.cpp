#include<stdio.h>
#include<ctype.h>
#define size 100
int stack[size];
int top=-1;
void push(int x){
	if(top==size-1){
		printf("stack overflow :");
	}
	else{
		top++;
		stack[top]=x;
	}
}
int pop(){
	int item;
	if(top==-1){
		printf("stack underflow :");
		
	}
	else{
		item=stack[top];
		top--;
		return(item);
		
		
	}
}
void evalpostfix(char infix_exp[],int op1,int op2){
	int i,j,result;
	char temp;
	
	i=0;
	j=0;
	temp=infix_exp[i];
	while(temp!='\0'){
		if(isdigit(temp)){
			push(temp);
		}
		else if(temp=='+'){
			op2=pop();
			op1=pop();
			result=op1+op2;
			push(result);
		}
		else if(temp=='-'){
			op2=pop();
			op1=pop();
			result=op1-op2;
			push(result);
		}
		else if(temp=='*'){
			op2=pop();
			op1=pop();
			result=op1*op2;
			push(result);
		}
		else if(temp=='/'){
			op2=pop();
			op1=pop();
			result=op1/op2;
			push(result);
			
		}
		else{
			return;
		}
		
		i++;
		temp=infix_exp[i];
		
		
	}
}
int main(){
	char infix_exp[size],postfix_exp[size];
	int op1,op2;
	printf("Enter the expression:");
	scanf("%d",infix_exp);
	evalpostfix(infix_exp,op1,op2);
	printf("evaluted postfix expression :",postfix_exp);
	return 0;
}
