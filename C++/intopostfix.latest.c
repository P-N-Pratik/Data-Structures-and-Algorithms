#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

#define size 100
char stack[size];
int top=-1;
void push(char temp){
	if(top==size-1){
		printf("Stack overflow :");
	}
	else{
		top++;
		stack[top]=temp;
	}
}
char pop(){
	char temp;
	if(top==-1){ 
		printf("Stack underflow :");
	}
	else{
		
		temp=stack[top];
		top--;
		return(temp);
	}
}

int priority(char symbol){
	if(symbol=='^'){
		return 3;
	}
	else if(symbol=='*' || symbol=='/'){
		return 2;
	}
	else if(symbol=='+' || symbol=='-'){
		return 1;
	}
	else{
		return 0;
	}
}

void intopostfix(char infix_exp[],char postfix_exp[]){
	int i;
	int j;
	char temp,item;
	
	push('(');                              
	strcat(infix_exp,")"); 
	
	i=0;
	j=0;
	temp=infix_exp[i];
	while(temp!='\0'){
		if(temp == '('){
			push(temp);
			
		}
		else if(isalpha(temp)||isdigit(temp)){
			postfix_exp[j] = temp;
			j++;
		}
		else if(temp == ')'){
			item = pop();
			while(item != '('){
				postfix_exp[j] = item;
				j++;
				item = pop();	
			}
		}
		else{
			item=pop();
			while(priority(item)>=priority(temp)){
				postfix_exp[j] = item;
				j++;
				item = pop();
			}
			push(item);
			
			
			push(temp);
		
		}
		
		i++;
		
		
	    temp = infix_exp[i];
	}
	postfix_exp[j]='\0';
	
	
	

	
	

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
