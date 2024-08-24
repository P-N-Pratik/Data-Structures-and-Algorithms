#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
	
};
struct node *head=NULL;
struct node *temp=NULL;

void first_node(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	head=temp=newnode;
	
}
void end_node(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	first_node=newnode;
	
	temp=newnode;
}
void display_list(){
	struct node *ptr;
	ptr=head;
	while(ptr!=NULL){
		printf("%d",ptr->data);
		ptr=ptr->next;
	}
}
int main(){
	int choice;
	while(1){
		printf("1.FIRST NODE \n 2.END NODE\n 3.DISPLAY LIST\n");
		printf("ENTER YOUR CHOICE :");
		scanf("%d",&choice);
		switch(choice){
			
		case 1:
			first_node();
			break;
		case 2:
			end_node();
			break;
		case 3:
			display_list();
			break;
		default:
			printf("INVALID CHOICE PLEASE CHOOSE CORRECT ONE :");
			break;
			
	}
	
}
return 0;
}
