#include<stdio.h>
#define size 5
int que[size];
int front=-1;
int rear=-1;
void enqueue(){
	int item;
	if(rear==size-1){
		printf("STACK OVERFL0W :");
		return;
	}
	else if(front==-1 && rear==-1){
		front=rear=0;
		
	}
	else{
		rear=rear+1;
		
	}
	printf("ENTER THE DATA :");
	scanf("%d",&item);
	que[rear]=item;
}

void dequeue(){
	int item;
	if(front==-1){
		printf("STACK UNDERFLOW :");
		
	}
	else if(front==rear){
		item=que[front];
		front=rear=-1;
		
	}
	else{
		item=que[front];
		front=front+1;
	}
}

void display(){
	for(int i=front;i<=rear;i++){
		printf("%d\n",que[i]);
	}
}
int main(){
	int choice;
	while(1){
		printf("\nFUNCTIONS TO IMPLEMENT THE  QUEUE ARE AS FOLLOWS:\n");
		printf("1.TO ENQUEUE :\n");
		printf("2.TO DEQUEUE :\n");
		printf("3.DISPLAY :\n");
		printf("ENTER THE CHOICE :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				enqueue();
				break;
			case 2:
			 	dequeue();
				break;
			case 3:
				printf("THE ELEMENTS IN THE QUEUE ARE :\n");
				display();
				break;
				
					 	
		}
		
	}
	return 0;
	
}
