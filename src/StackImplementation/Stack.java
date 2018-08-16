package StackImplementation;

public class Stack {

	int Stack[] = new int[5];
	int top = 0;
	
	public void push(int data)
	{
		Stack[top] = data;
		top++;
	}
	
	public void pop()
	{
		int temp;
		for(int i=top;i>0;i++)
		{
		top--;
		temp = Stack[top];
		Stack[top]=0;
		System.out.print(temp + " ");
		}
	}

	public void show()
	{
		for(int i:Stack)
			System.out.print(i + " ");
	}
	
}


