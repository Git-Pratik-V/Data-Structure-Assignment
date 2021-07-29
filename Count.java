import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		int choice;
		
		LinkedList ll=new LinkedList();
		
		do {
			System.out.println(""
					+ "1.ADD ELEMENT"
					+ "\n 2. Count"
					+ "\n 0.EXIT");
			choice=ob.nextInt();
			
			switch (choice) {
			case 1:
				
				System.out.println("enter the elements");
				ll.insertRight(ob.nextInt());
				
				break;
			case 2:
				System.out.println("count is"+ ll.count());
				break;
				
			case 0:
				break;
				
			default:
					System.out.println("wrong choice");
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
	
}