#include<iostream>
using namespace std;
#define size 5
int top=-1;
int stack[size];
int push(int x){
	if(top==size-1){
		cout<<"Stack overflow";
		
	}
	else{
		top++;
		stack[top]=x;
	}
}

void pop(){
	if(top==-1){
		cout<<"Stack underflow";
	}
	else{
		int item=stack[top];
		top--;
	}
	
}
void display(){
	if(top==-1){
		cout<<"Stack is Empty";
		
	}
	else{
		for(int i=top;i>=0;i--){
			cout<<stack[i];
		}
	}
}
int main(){
	int choice,x;
	while(1){
		
	cout<<"\nENTER YOUR CHOICE :";
	cin>>choice;
	switch(choice){
		
		case 1:
			cout<<"\nENTER THE ELEMENT YOU WANT TO PUSH:";
			cin>>x;
			push(x);
			cout<<"\nTHE ELEMENT YOU PUSHED IS :"<<x;
			break;
			case 2:
				pop();
				break;
				case 3:
					display();
					break;
					case 4:
						exit(0);
						
	}
	}
	return 0;
}
