import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		LinkedList linkedlist=new LinkedList();
		
		
		int choice,cn;
		
		do {
			System.out.println(""
					+ "1.ADD ELEMENT"
					+ "\n 2. REVERSE"
					+ "\n 0.EXIT");
			choice=ob.nextInt();
			
			switch (choice) {
			case 1:
				
				System.out.println("\n 1. add elment to left"+"\n 2.add element to right");
				int ch=ob.nextInt();
				
				
						switch(ch)
						{
						case 1:System.out.println("enter element left");
						linkedlist.insertleft(ob.nextInt());
						break;
						
						case 2:System.out.println("enter element right");
						linkedlist.insertRight(ob.nextInt());
						break;
						
						default:System.out.println("wrong choice");
						break;
						}
					
					break;
			case 2:
					System.out.println("reverse is:");
					Stack stack =new Stack(linkedlist.count());
					stack=linkedlist.TraverseLinkedList(stack);
					stack.print();
					break;
					
			case 0:
				break;
					
			default:System.out.println("wrong choice");
			break;
			}
		}while(choice!=0);
	}

}
class LinkedList
{
	class Node
	{
		int data;
		Node next;
		Node(int element)
		{
			data=element;
			next=null;
		}
	}
	Node root;
	LinkedList()
	{
		root=null;
	}
	
	public void insertRight(int element)
	{
		Node node=new Node(element);
		if(root==null)
		{
			root=node;
		}
		else
		{
			Node t=root;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=node;
		}
	}
	
	public void insertleft(int element)
	{
		Node node=new Node(element);
		if(root==null)
		{
			root=node;
		}
		else
		{
			node.next=root;
			root=node;
		}
	}
	
	public int count()
	{
		int cnt=0;
		if(root==null)
		{
			cnt=0;
		}
		else
		{
			Node t=root;
			while(t!=null)
			{
				cnt++;
				t=t.next;
			}
		}
		return cnt;
	}
	
	public Stack TraverseLinkedList(Stack st)
	{
		
		if(root==null)
		{
			System.out.println("put input again..linked list empty");
		}
		else
		{
			Node t=root;
			
			while(t!=null)
			{
				st.PushStack(t.data);
				t=t.next;
				//System.out.println("hello");
			}
		}
		return st;
	}
}
	
class Stack
{
	int ar[],tos,size,element;
	Stack(int size)
	{
		this.size=size;
		tos=-1;
		ar=new int[size];
	}
	
	public void PushStack(int element)
	{
		tos++;
		//System.out.println("2");
		ar[tos]=element;
	}
	
	public void print()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}

