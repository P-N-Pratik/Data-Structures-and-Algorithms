#include <stdio.h>

typedef struct node
{
    int data;
    struct node *next;
    struct node *perv;
}NODE;

void dispFList(NODE *);
void dispBList(NODE *);
void *sortlist(NODE *);
void bubleSort(int,int);

int main()
{
    NODE n1,n2,n3,n4;
    NODE *head=NULL,*temp=NULL;

    n1.data = 10;
    n1.next = NULL;
    n1.perv = NULL;

    n2.data = 20;
    n2.next = NULL;
    n2.perv = NULL;

    n3.data = 30;
    n3.next = NULL;
    n3.perv = NULL;

    n1.next = &n2;
    n2.perv = &n1;
    n2.next = &n3;
    n3.perv = &n2;

    head = &n1;
    temp = head;

    dispFList(temp);

    dispBList(temp);
    return 0;
}

void dispFList(NODE *t)
{
    printf("\nList is\n");
    while(t)
    {
        printf("%d->", t->data);
        t = t->next;
    }
    printf("NULL\n\n");
}

void dispBList(NODE *t)
{
    printf("\bBackward List\n");
    while(t->next != NULL)
    {
        t = t->next;
    }
    // printf("\nBL: %d",t->data);

    while(t)
    {
        printf("%d->", t->data);
        t = t->perv;
    }
    printf("NULL\n\n");
}
void *sortList(NODE *head){
	NODE *temp = head;
	int n = 0,i;
	
	while(temp){
		temp = temp->next;
		n++;
	}
	temp = head;
	int *a = (int *)malloc(n * sizeof(int));
    if (a == NULL) {
        // Handle memory allocation failure
        return NULL;
    }
    // Fill the array with linked list data
    for (i = 0; i < n; i++) {
        a[i] = temp->data;
        temp = temp->next;
    }
    //calling bubblesort to sort the array
    bubbleSort(a,n);
    
    temp = head;
    i = 0;
    while(temp){
    	temp->data = a[i];
    	temp = temp->next;
    	i++;
	}
	free(a);
}
void bubbleSort(int arr[], int n) {
	int i,j;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap elements if they are in the wrong order
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
