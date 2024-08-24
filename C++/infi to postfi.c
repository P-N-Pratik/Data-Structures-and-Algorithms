#include<stdio.h>
#include<stdlib.h>      
#include<ctype.h>     
#include<string.h>

#define SIZE 100



char stack[SIZE];
int top = -1;



void push(char temp)
{
	if(top == SIZE-1)
	{
		printf("\nStack Overflow.");
	}
	else
	{
		top = top+1;
		stack[top] = temp;
	}
}


char pop()
{
	char temp ;

	if(top==-1)
	{
		printf("stack under flow: invalid infix expression");
	
	}
	else
	{
		temp = stack[top];
		top = top-1;
		return(temp);
	}
}







int precedence(char symbol)
{
	if(symbol == '^')
	{
		return 3;
	}
	else if(symbol == '*' || symbol == '/')
	{
		return 2;
	}
	else if(symbol == '+' || symbol == '-')        
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

void InfixToPostfix(char infix_exp[], char postfix_exp[])
{ 
	int i, j;
	char item;
	char temp;

	push('(');                              
	strcat(infix_exp,")");                 

	i=0;
	j=0;
	temp=infix_exp[i];         
	while(temp != '\0')        
	{
		if(temp == '(')
		{
			push(temp);
		}
		else if( isdigit(temp) || isalpha(temp))
		{
			postfix_exp[j] = temp;              
			j++;
		}

		else if(temp == ')')         
		{
			item = pop();                   
			while(item != '(')               
			{
				postfix_exp[j] = item;
				j++;
				item = pop();
			}
		}
		else       
		{
			item=pop();
			while(precedence(item)>= precedence(temp))
			{
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



	postfix_exp[j] = '\0'; 


}


int main()
{
	char infix_exp[SIZE], postfix_exp[SIZE];         


	printf("ASSUMPTION: The infix expression contains single letter variables and single digit constants only.\n");
	printf("\nEnter Infix expression : ");
	gets(infix_exp);

	InfixToPostfix(infix_exp,postfix_exp);                   
	printf("Postfix Expression: ");
	puts(postfix_exp);                    
	return 0;
}
