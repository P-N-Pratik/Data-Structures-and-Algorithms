#include<stdio.h>
#include<stdlib.h>


struct node{
	int data;
	struct node *next;
};
struct node *head=NULL;
struct node *tail=NULL;
void create_list();
void print_list();
int main(){
	
	int ch;
	while(1){
		
		printf("1.CREATE LIST 2.PRINT LIST\n");
		printf("Enter choice :");
		scanf("%d",&ch);
		switch(ch){
			case 1:create_list();
			break;
			case 2:print_list();
			break;
			default:printf("INVALID CHOICE :");	
			break;
					
		}
		
	}
}

void create_list(){
	struct node *temp;
	temp=(struct node*)malloc(sizeof(struct node));
	printf("Enter the data :");
	scanf("%d",&temp->data);
	if(head==NULL){
		temp->next=NULL;
		head=temp;
		tail=temp;
		
	}
	else{
		tail->next=temp;
		tail=temp;
		tail->next=NULL;
	}
}
void print_list(){
	struct node *ptr;
	if(head==NULL){
		printf("List is empty :");
		
	}
	else{
		for(ptr=head;ptr!=NULL;ptr=ptr->next){
			printf("%d\n",ptr->data);
		}
	}
}

