#include <stdio.h>

struct node
{
  int val;
  struct node *ptr;
};
int main()
{
    //creating node
    struct node n1,n2,n3,n4,n5;
    struct node *head=NULL, *temp=NULL;
   
    //assigning values
   
    n1.val = 10;
    n1.ptr = NULL;
    n2.val = 20;
    n2.ptr = NULL;
    n3.val = 30;
    n3.ptr = NULL;
   
    // make a relationship/link it
   
    n1.ptr = &n2;
    n2.ptr = &n3;
   
    // traversse
    head = &n1;
   
   
    while(head!=NULL){
      printf("%d->",head->val);
      head = head->ptr;
   
    }
   
    n4.val = 40;
    n4.ptr = NULL;
    head =&n1;
    while(head!=NULL)
    {
      if (head->val == 20)
        break;
      head = head->ptr;
    }
   
    temp = head->ptr;
    printf("\ntemp=%d",temp->val);
   
    head->ptr = &n4;
    n4.ptr = temp;
   
    head = &n1;
   
     while(head!=NULL){
      printf("%d->",head->val);
      head = head->ptr;
   
    }
    
    n5.val=99;
    n5.ptr=&n1;
    head=&n5;
    
    printf("\n%d",head->val);
    
    
   
   
   
   
   
}
