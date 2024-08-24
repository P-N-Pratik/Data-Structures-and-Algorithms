#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
void insertfirst(){
	struct node *newnode;
	int x;
	
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",&x);
	newnode->data=x;
	newnode->next=NULL;
	
	
}
void insertend(){
	struct node *newnode,*head,*temp;
	int x;
	head=0;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",&x);
	newnode->data=x;
	newnode->next=0;
	if(head==0){
		head=temp=newnode;
		
		
	}
	else{
		head->next=newnode;
		temp=newnode;
	}
	
}
void display(){
	struct node *temp,*head;
	temp=head;

	while(temp!=0){
		printf("%d\n",temp->data);
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
				insertfirst();
				break;
			case 2:
				insertend();
				break;
			case 3:
				display();
				break;
			default:
				printf("INVALID CHOICE");
				
				
				
		}
	}
}
