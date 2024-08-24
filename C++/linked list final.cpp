#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
struct node *head=NULL;
struct node *temp=NULL;
void create_node(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("\nENTER THE DATA :");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	if(head==NULL){
		head=temp=newnode;
		
	}
	else{
		temp->next=newnode;
		temp=temp->next;
		temp->next=NULL;
	}
}
void print_list(){
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
		printf("1.CREATE NODE\n 2.PRINT LIST\n");
		printf("ENTER YOUR CHOICE :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				create_node();
				break;
			case 2:
				print_list();
				break;
			default:
				printf("INVALID CHOICE PLEASE CHOOSE THE CORRECT ONE :");
				
		}
	}
	return 0;
	
}
