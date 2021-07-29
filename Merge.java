import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		
Scanner ob=new Scanner(System.in);
		
		LinkedList linkedlist1=new LinkedList();
		LinkedList linkedlist2=new LinkedList();
		LinkedList linkedlist3=new LinkedList();
		
		System.out.println("Input for 1st linked list");
		int ch,cho;
		do
		{
			System.out.println("\n 1. add elment to left"+"\n 2.add element to right"+"\n 0. Exit");
			ch=ob.nextInt();
			
			
					switch(ch)
					{
					case 1:System.out.println("enter element left");
					linkedlist1.insertleft(ob.nextInt());
					break;
					
					case 2:System.out.println("enter element right");
					linkedlist1.insertRight(ob.nextInt());
					break;
					
					case 0: break;
					
					default:System.out.println("wrong choice");
					break;
					}
		}while(ch!=0);
			
		System.out.println("\n input for second linked list");
		do
		{
			System.out.println("\n 1. add elment to left"+"\n 2.add element to right"+"\n 0.Exit");
			cho=ob.nextInt();
					switch(cho)
					{
					case 1:System.out.println("enter element left");
					linkedlist2.insertleft(ob.nextInt());
					break;
					
					case 2:System.out.println("enter element right");
					linkedlist2.insertRight(ob.nextInt());
					break;
					
					case 0: break;
	
					default:System.out.println("wrong choice");
					break;
					}
	}while(cho!=0);
		
		linkedlist1.TraverseLinkedList(linkedlist3);
		
		linkedlist2.TraverseLinkedList(linkedlist3);
		
		System.out.println("merge is:");
		linkedlist3.print();
		
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
	
	public void TraverseLinkedList(LinkedList linkedlist3)
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
				linkedlist3.addtolinkedlist3(t.data);
				t=t.next;
				
			}
		}
	}

	public void addtolinkedlist3(int element)
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
	
	public void print()
	{
		if(root==null)
		{
			System.out.println("empty");
		}
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