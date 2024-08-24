#include <stdio.h>
#include <stdlib.h>

struct node
{
	struct node *prev;
  int val;
  struct node *next;
};

typedef struct node NODE;

void *createNNode();
NODE *appendList(NODE *,NODE *);
int dispMenu();
void dispList(NODE *);

NODE *begginingOfTheList(NODE *nn,NODE *head)
{
	printf("\nEnter the Number : ");
	scanf("%d",&nn->val);
	
	NODE *temp=head;
	temp->prev=nn;
	nn->next=temp;
	head=nn;
	nn->prev=NULL;
	
	
}
NODE *deleteNode(NODE *head)
{
	NODE *temp=head;
	int key;
	NODE *ptr=NULL;
	printf("\nEnter the key : ");
	scanf("%d",&key);
	
	int count=0;
	while(temp->next)
	{
		
		
		if(count==0)
		{
			count++;
			if(temp->val==key)
			{
				head=temp->next;
				head->prev=NULL:
				
				break;
					
			}
			
		}
		else
		{
			ptr=temp->next;
			
			if(ptr->val==key)
			{
				ptr->prev=NULL;
				temp->next=ptr->next;
				ptr->prev=temp;
				break;
			}
			else
			{
				temp=temp->next;
				
			}
			
			
		}



	}
}


NODE *addKeyValue(NODE *nn,NODE *head)
{
	NODE *temp=head;
	int key;
	printf("\nEnter the Key : ");
	scanf("%d",&key);
	printf("\nEnter the VAlue : ");
	scanf("%d",&nn->val);
	
	while(temp->next)
	{
		if(temp->val==key)
		{
			nn->next=temp->next;
			temp->next=nn;
			break;
			
		}
		else
		{
			temp=temp->next;
		}
	}
	return head;
	
}

int main()
{
   
    NODE *newNode=NULL,*temp=NULL,*head=NULL;
    int ch=0, flag=0;
   
   
    while(1)
    {
        ch = dispMenu();
        switch (ch)
        {
        case 1: 
            newNode = (NODE *)createNNode();
            // newNode->next = NULL;
            head = appendList(newNode, head);
            dispList(head);
            break;
        case 2:
        	newNode=(NODE *)createNNode();
        	head=begginingOfTheList(newNode,head);
        	
            break;
        case 3:
        	newNode=(NODE *)createNNode();
        	head=addKeyValue(newNode,head);
            break;
        case 4:
        	head=deleteNode(head);
            break;
        case 5: 
            break;
        case 6:
            dispList(head);
            break;
        case 7:
        	
            break;
        case 0:
            printf("\nEnd of the Program\n");
            flag = 1;
            break;
        default:
            printf("\nEnter the correct Choice\n");
            break;
        }

        if (flag == 1)
            break;
        
    }// end of while loop
   
       
    return 0;
}






void *createNNode()
{
    return (malloc(sizeof(NODE)));
}

void dispList(NODE *h)
{
    printf("\nList is\n");
    while(h)
    {
        printf("%d->", h->val);
        
        h = h->next;
    }
    printf("NULL\n\n");

}

int dispMenu()
{
    int ch = 0;
    printf("\nPress....");
    printf("\n1. Creating New Node");
    printf("\n2. Add Node to the Begining of the List");
    printf("\n3. Add Node after Key value");
    printf("\n4. Delete a node key value");
    printf("\n5. Pop the element from list");
    printf("\n6. Display List");
    printf("\n0. Exit");
    printf("\nChoice: ");
    scanf("%d",&ch);
    return ch; 
}




NODE *appendList(NODE *nn, NODE *head)
{
    NODE *temp = head;
    printf("\nEnter the value of New Node: ");
    scanf("%d",&nn->val);
    nn->next = NULL;

    if(temp == NULL)
    {
        head = nn;
        temp = nn;
        
    }
    else
    {
        while(temp->next)
        {
            temp = temp->next;
        }
        temp->next = nn;
        nn->prev=temp;
    }

    return head;

}
