#include<stdio.h>
#define size 100
int stack[size];
int top=-1;

void push(int x){
	printf("ENTER THE ELEMENT :");
	scanf("%d",&x);
	if(top==size-1){
		printf("STACK OVERFLOW :");
	}
	else{
		top++;
		stack[top]=x;
	}
}
void pop(){
	int x;
	if(top==-1){
		printf("STACK UNDERFLOW :");
	}
	else{
		printf("THE POPPED ELEMENT IS %d\n",stack[top]);
        top=top-1;
		
	}
}
void display(){
	int ptr;
	if(top==-1){
		printf("STACK UNDERFLOW :");
		return;
	}
	else{
		for(ptr=top;ptr>=0;ptr--){
			printf("%d\n",stack[ptr]);
		}
	}
}
int main(){
	int choice,x;
	while(1){
		printf(" 1.PUSH ELEMENT\n 2.POP ELEMENT\n 3.DISPLAY ELEMENT \n");
		printf("CHOOSE THE OPERATION YOU WANT TO PERFORM :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				push(x);
				break;
			case 2:
			    pop();
				break;
			case 3:
				printf("THE ELEMENTS IN THE STACK ARE :\n");
				display();
				break;
		}
	}
	return 0;
}
