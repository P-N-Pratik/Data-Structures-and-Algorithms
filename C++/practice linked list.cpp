#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
void insertfirstnode(){
	struct node *newnode,*head;
	head=0;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",head->data);
	head->next=0;
	
	
}
void insertnextnode(){
	struct node *newnode,*head,*temp;
	head=0;
	newnode=(struct node*)malloc(sizeof(struct node));
	head=temp=newnode;
	printf("Enter the data :");
	scanf("%d",temp->data);
	temp->next=newnode;
	temp=newnode;
	
	
	
}
void display(){
	struct node *temp;
	while(temp!=0){
		printf("%d",temp->data);
		temp=temp->next;
	}
}
int main(){
		int choice;
	while(1){
		printf("1.INSERT FIRST 2.INSERT LAST 3.DISPLAY\n");
		printf("Enter the choice :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				insertfirstnode();
				break;
			case 2:
				insertnextnode();
				break;
			case 3:
				display();
				break;
			default:
				printf("INVALID CHOICE");
				
				
				
		}
	}
}

