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
	printf("ENTER THE DATA :");
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
void display_list(){
	struct node *ptr;
	ptr=head;
	while(ptr!=NULL){
		printf("%d\n",ptr->data);
		ptr=ptr->next;
		
	}
}
void insert_beg(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("ENTER THE DATA :");
	scanf("%d",&newnode->data);
	newnode->next=head;
	head=newnode;
}
void insert_end(){
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("ENTER THE DATA :");
	scanf("%d",&newnode->data);
	temp->next=newnode;
	temp=temp->next;
	temp->next=NULL;
}
void insert_middle(){
	int pos;
	int i=1;
	struct node *newnode;
	struct node *cur=head;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("ENTER THE DATA :");
	scanf("%d",&newnode->data);
	printf("ENTER THE POSITION :");
	scanf("%d",&pos);
	while(pos!=i+1){
		cur=cur->next;
		i++;
	}
	newnode->next=cur->next;
	cur->next=newnode;
	
	
}
void delete_beg(){
	struct node *ptr;
	ptr=head;
	head=head->next;
	printf("ELEMENT DELETED IS %d\n",ptr->data);
	free(ptr);
}

void delete_mid(){
	int pos;
	int i=1;
	struct node *ptr;
	struct node *cur;
	cur=head;
	printf("ENTER THE POSITION TO BE DELETED :");
	scanf("%d",&pos);
	while(pos!=i+1){
		cur=cur->next;
	}
	ptr=cur->next;
	cur->next=ptr->next;
	printf("ELEMENT DELETED IS  :",ptr->data);
	free(ptr);
	
	
	
}

void delete_end(){
	struct node *tem;
	struct node *ptr;
	ptr=head;
	while(ptr->next->next!=NULL){
		ptr=ptr->next;
		
	}
	if(ptr->next->next==NULL){
		tem=ptr->next;
		ptr->next=NULL;
		temp=ptr;
		printf("ELEMENT DELETED IS %d",tem->data);
		free(tem);
		
	}
	
}


int main(){
	int choice;
	while(1){
		printf(" 1.CREATE NODE\n 2.DISPLAY LIST\n 3.INSERT AT BEGINNING\n 4.INSERT AT MIDDLE\n 5.INSERT AT END\n 6.EXIT\n 7.DELETE FROM BEGINNING\n 8.DELETE FROM MID\n 9.DELETE FROM END\n");
		printf("\n ENTER YOUR CHOICE :");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				create_node();
				break;
			case 2:
				printf("THE ELEMENTS IN THE LIST ARE AS FOLLOWS :\n");
				display_list();
				break;
			case 3:
				insert_beg();
			    break;
			case 4:
			 	insert_middle();
				break; 
			case 5:
				insert_end();
				break;
			case 6:
				exit(0);
				break;
			case 7:
				delete_beg();
				break;
			case 8:
				delete_mid();
				break;
			case 9:
				delete_end();
				break;				
			    
				
			default:
				printf("INVALID CHOICE PLEASE ENTER THE CORRECT CHOICE :");
				break;
				
					
		}
	}
	return 0;
	
}
