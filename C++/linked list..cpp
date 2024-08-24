#include <stdio.h>
#include <stdlib.h>
struct node {
    int data;          
    struct node *next; 
}*head;
void Starting_Link_List(int n);
void insertNodeAtMiddle(int data, int position);
void ShowSingly_List();
int main()
{
    int n, data, position;
 
    printf("Please Enter the total number of nodes: ");
    scanf("%d", &n);
    Starting_Link_List(n);
    printf("\nData in the singly link list \n");
    ShowSingly_List();
   
    printf("n Please Enter data to insert at middle of the list: ");
    scanf("%d", &data);
    printf("Enter the position to insert new node: " );
    scanf("%d", &position);
    insertNodeAtMiddle(data, position);
 
    printf("\n Data in the SINGLY LINK list \n");
    ShowSingly_List();
 
    return 0;
}
void Starting_Link_List(int n)
{
    struct node *newNode, *temp;
    int data, i;
 
    head = (struct node *)malloc(sizeof(struct node));
 
    
    if(head == NULL)
    {
        printf("Sorry! Unable to allocate memory.");
    }
    else
    {
        
        printf("Please Enter the data for node 1: ");
        scanf("%d", &data);
 
        head->data = data; 
        head->next = NULL; 
 
        temp = head;
 
        
        for(i=2; i<=n; i++)
        {
            newNode = (struct node *)malloc(sizeof(struct node));
 
         
            if(newNode == NULL)
            {
                printf("Sorry! Unable to allocate memory.");
                break;
            }
            else
            {
                printf("Please Enter the data of node %d: ", i);
                scanf("%d", &data);
 
                newNode->data = data; 
                newNode->next = NULL; 
 
                temp->next = newNode; 
                temp = temp->next;
            }
        }
 
        printf("Congratulations! Your SINGLY LINKED LIST is CREATED.\n");
    }
}
 
void insertNodeAtMiddle(int data, int position)
{
    int i;
    struct node *newNode, *temp;
 
    newNode = (struct node*)malloc(sizeof(struct node));
 
    if(newNode == NULL)
    {
        printf("Unable to allocate memory.");
    }
    else
    {
        newNode->data = data; 
        newNode->next = NULL;
 
        temp = head;
 
        
        for(i=2; i<=position-1; i++)
        {
            temp = temp->next;
 
            if(temp == NULL)
                break;
        }
 
        if(temp != NULL)
        {
            
            newNode->next = temp->next; 
 
            
            temp->next = newNode;
 
            printf("DATA INSERTED SUCCESSFULLY\n");
        }
        else
        {
            printf("UNABLE TO INSERT DATA AT THE GIVEN POSITION\n");
        }
    }
}
 
 

void ShowSingly_List()
{
    struct node *temp;
 
    
    if(head == NULL)
    {
        printf("List is empty.");
    }
    else
    {
        temp = head;
        while(temp != NULL)
        {
            printf("Data = %d\n", temp->data); 
            temp = temp->next;                 
        }
    }
}
