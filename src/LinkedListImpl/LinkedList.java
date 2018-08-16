package LinkedListImpl;

public class LinkedList {

	Node head;
	int c = 0;
	
	void insert(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			 head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
			  n = n.next;
			}
			n.next = node;
		}
	}
	
	void show()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	void count()
	{
		
		Node n = head;
		while(n != null)
		{
			c = c + 1;
			n = n.next;
		}
		System.out.println("\n" + c);
	}
	
	void mid()
	{
		Node n = head;
		for(int i=0;i < c/2;i++)
		{
			n = n.next;

		}
		System.out.println(n.data);
	}
}
