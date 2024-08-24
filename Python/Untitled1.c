#include<stdio.h>
#include<stdlib.h>

//int main()
//{
//	int *ptr=NULL,*temp=NULL;
//	ptr=(int *)malloc(3*sizeof(int));
//	temp=ptr;
//	printf("Adddress of ptr =%u",&ptr);
//	*ptr-10;
//	printf("Adddress of ptr =%u and its value=%d\n",ptr,*ptr);
//	ptr++;
//	*ptr=20;
//	printf("Adddress of ptr =%u and its value=%d\n",ptr,*ptr);
//	ptr++;
//	*ptr=30;
//	printf("Adddress of ptr =%u and its value=%d\n",ptr,*ptr);
//	ptr =temp;
//	printf("Adddress of ptr =%u and its value=%d\n",ptr,*ptr);
//	
//	ptr++;
//	printf("\n%d\n",ptr[2]);
//}
#include <stdio.h>
#include <stdlib.h>

struct node
{
  int val;
  struct node *next;
};

typedef struct node NODE;

int main()
{
   
    NODE *newNode=NULL,*temp=NULL,*head=NULL;
    int ch=1;
   
   
    while(ch)
    {
        newNode = (NODE *)malloc(sizeof(NODE));
        //assign values
        printf("\nEnter the value of New Node: ");
        scanf("%d",&newNode->val);
        newNode->next = NULL;

        if(head == NULL)
        {
            // list is empty
            head = newNode;
            temp = newNode;
        }
        else
        {
            // list is not empty
            temp->next = newNode;
            temp = temp->next;
        }



      printf("\nDo you want to add new node (0/1): ");
      scanf("%d",&ch);
    }
   
    temp = head;
     while (temp != NULL)
     {
        printf("%d->", temp->val);
        temp= temp->next;
     }
   
    return 0;
}







