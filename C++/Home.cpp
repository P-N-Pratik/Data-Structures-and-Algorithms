#include<stdio.h>
#include<ctype.h>
#include<string.h>
#define size 100
char stack[size];
int top=-1;
void push(char x){
	if(top==size-1){
		printf("stack overflow :");
	}
	else{
		top++;
		stack[top]=x;
		
	}

}
char pop(){
	char item;
	if(top==-1){
		printf("stack underflow :");
	}
	else{
		item=stack[top];
		top--;
		return(item);
	}
}
int precedence(char symbol){
	if(symbol=='^'){
		return 3;
	}
	else if(symbol=='*'||symbol=='/'){
		return 2;
	}
	else if(symbol=='+'||symbol=='-'){
		return 1;
	}
	else{
		return 0;
	}
}
void intopostfix(char infix_exp[],char postfix_exp[]){
	int i,j;
	char item,temp;
	
	
	
	i=0;
	j=0;
	temp=infix_exp[i];
	while(temp!='\0'){
		if(temp=='('){
			push(temp);
		}
		else if(isalpha(temp)||isdigit(temp)){
			postfix_exp[j]=temp;
			j++;
		}
		else if(temp==')'){
			item=pop();
			while(item!='('){
				postfix_exp[j]=item;
				j++;
				item=pop();
			
			}
		}
		else{
			item=pop();
			while(precedence(item)>=precedence(temp)){
				postfix_exp[j]=item;
				j++;
				item=pop();
			
			}
			push(item);
		
			push(temp);
		}
		i++;
	
		temp=infix_exp[i];
	
	
 	}
 	
}
int main(){
		char infix_exp[size], postfix_exp[size];   
	      
	printf("Enter the expression :");
	gets(infix_exp);
	
	intopostfix(infix_exp,postfix_exp);
	printf("Postfix expression :");
	puts(postfix_exp);
	return 0;

	
}

