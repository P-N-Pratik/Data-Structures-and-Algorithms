#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
void first_node(){
	
	struct node *newnode,*head;
	head=NULL;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",newnode->data);
	newnode->next=NULL;
	

}
void last_node(){
	struct node *newnode,*head,*temp;
	
	newnode=(struct node*)malloc(sizeof(struct node));
	head=NULL;
	printf("Enter the data :");
	scanf("%d",newnode->data);
	if(head==NULL){
		
		head=temp=newnode;
		
	}
	else{
		temp->next=newnode;
		temp=temp->next;
		
		
	}
	
	
}


int main(){
	int choice;
	while(1){
		printf("1.FIRST_NODE 2.LAST NODE 3.DISPLAY\n");
		printf("ENTER THE CHOICE :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				first_node();
				break;
			case 2:
				last_node();
				break;
		
			default:
				printf("INVALID CHOICE");
				
				
		}
	}
	
}

