import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList ll=new LinkedList();
		
		int choice;
		
		do
		{
			System.out.println("\n 1.Enter the element"+"\n 2.Sort"+"\n 0.Exit");
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
						System.out.println("sorting is:");
						ll.sort();
						
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
	
	public void sort() {
		if(root==null || root.next==null) 
			System.out.println("ALREADY SORTED LIST");
		else {
			Node node=root;
			Node t=root.next;

			while(node.next!=null) {
				t=node.next;
				while(t!=null) {
					if(node.data>t.data) {
						int temp=node.data;
						node.data=t.data;
						t.data=temp;
					}
					t=t.next;	
				}
				node=node.next;
			}
			print();
		
		}
	}
	public void print()
	{
		if(root==null)
			System.out.println("empty");
		else
		{
			Node t=root;
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
}
