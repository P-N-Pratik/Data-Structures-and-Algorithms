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
	head=newnode;
	head->next=NULL;

}
void last_node(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",&newnode->data);
	temp->next=newnode;
	temp=temp->next;
    temp->next=NULL;
	    
	
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
		printf("1.first node 2.last node 3.display list \n");
		printf("ENTER YOUR CHOICE :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				first_node();
				break;
			case 2:
				last_node();
				break;
			case 3:
				display_list();
				break;
		 	default:
				printf("INVALID CHOICE :");
				break;
					
				
		}
		
	}
}
