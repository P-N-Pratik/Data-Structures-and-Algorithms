#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *link;
};

struct node *head,*newnode;
head=0;
newnode=(struct node*)malloc(sizeof(struct node));
printf("Enter the data :");
scanf("%d",&newnode->data);
if(head==0){
	head=temp=newnode;
}
else{
	temp->next=newnode;
	temp=newnode;
	
}
