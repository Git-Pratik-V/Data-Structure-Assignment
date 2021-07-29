import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		LinkedList ll=new LinkedList();
		
		int choice;
		
		do
		{
			System.out.println("\n 1.Enter the element"+"\n 2.Maximum "+"\n 0.Exit");
			choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("\n 1.enter left"+"\n 2.enter right");
						int ch=sc.nextInt();
							switch(ch)
							{
							case 1:
								ll.insertleft(sc.nextInt());
								break;
								
							case 2:
								ll.insertRight(sc.nextInt());
								break;
								
							case 0: break;
							
							default:
								System.out.println("bad choice");
								break;
							}
							
						break;
						
					case 2:
						System.out.println("Maximum is:");
						ll.max();
						
					case 0: break;
					
					default:
						System.out.println("bad choice");
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
	
	public void max()
	{
		int max=0;
		if(root==null)
			System.out.println("no elements present");
		else
		{
			Node t=root;
			while(t!=null)
			{
				if(t.data>max)
				{
					max=t.data;
				}
				t=t.next;
			}
			System.out.println(max);
		}
	}
}