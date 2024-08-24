#include<stdio.h>
#define n 100
char stack[n];
int top=-1;
void push(char x){
	if(top==n-1){
		printf("stack overflow :");
	}
	else{
		top++;
		stack[top]=x;
	}
}
void pop(){
	char item;
	if(top==-1){
		printf("Stack underflow");
	}
	else{
		item=stack[top];
		stack[top--];
		return(item);
		
		
	}
}
int priority(char x){
	if(x=='^'){
		return 3;
	}
	if(x=='*' || x=='/'){
		return 2;
	}
	if(x=='+' || x=='-'){
		return 1;
	}
	
}
void infixtopostfix(char infix_exp[],char postfix_exp[]){
	int i=0;
	int j=0;
	char item,x;
	item=infix_exp[i];
	while(item!='\0'){
		if(item=='('){
			push(item);
		}
		else if(isalnum(item)){
			postfix_exp[j]=item;
			j++;
		}
		else if(item==')'){
			x=pop();
			while(x!='('){
				postfix_exp[j]=x;
				j++;
				x=pop();
			}
		}
		else{
			x=pop();
			while(int priority(x)>=priority(item)){
				postfix_exp[j]=x;
				j++;
				x=pop();
			push(x);
			
			
			push(item);
				
			}
		
		}
		i++;
	}
}
int main(){
	char infix[size],postfix[size];
	printf("Enter the expression:");
	gets(infix);
	
	infixtopostfic(infix,postfix);
	printf("Postfix expression");
	puts(postfix);
	return 0;
}
