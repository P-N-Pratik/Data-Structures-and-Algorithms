#include <stdio.h>
#include <stdlib.h>
int main()

{
	
	int *ptr=NULL;
	int *temp=NUll;
	printf("%d",temp);
	ptr=(int *)malloc(3*sizeof(int));
	temp=ptr;
	printf("\nAddress of ptr = %p",&ptr);
	*ptr=10;
	printf("\nAddress = %u and its value is %d",ptr,*ptr);
	ptr++;
	*ptr=20;
	printf("\nAddress = %u and its value is %d",ptr,*ptr);
	ptr++;
	*ptr=30;
	printf("\nAddress = %u and its value is %d",ptr,*ptr);
	ptr=temp;
	printf("\nAddress = %u and its value is %d",ptr,*ptr);
	ptr++;
	printf("\n%d\n",ptr[2]);
	
}
