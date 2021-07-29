import java.util.Scanner;

public class Mid {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Double doub=new Double();
		
		int choice;
		
		do
		{
			System.out.println("\n 1.Enter the element"+"\n 2.Mid"+"\n 0.Exit");
			choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("\n 1.enter left"+"\n 2.enter right");
						int ch=sc.nextInt();
							switch(ch)
							{
							case 1:
								doub.insertL(sc.nextInt());
								break;
								
							case 2:
								doub.insertR(sc.nextInt());
								break;
								
							case 0: break;
							
							default:
								System.out.println("bad choice");
								break;
							}
							
						break;
						
					case 2:
						System.out.println("merge is:");
						doub.FindMid();
						
					case 0: break;
					
					default:
						System.out.println("bad choice");
						break;
					}
		}while(choice!=0);
		
		/*doub.insertL(567);
		doub.insertL(598);
		doub.insertL(458);
		doub.insertR(10);
		doub.insertR(759);
		doub.insertR(4578);
		
		
		doub.FindMid();*/
		}
}
class Double
{
	class Node
	{
		 int data;
		Node left,right;
		Node(int element)
		{
			data=element;
			left=right=null;
		}
	}
	Node root;
	Double()
	{
		root=null;
	}
	
	public void insertL(int element)
	{
		Node n=new Node(element);
		if(root==null)
			root=n;
		else
		{
			n.right=root;
			root.left=n;
			root=n;
		}
	}
	
	public void insertR(int element)
	{
		Node n=new Node(element);
		if(root==null)
		root=n;
		else
		{
			Node t=root;
			while(t.right!=null)
			{
				t=t.right;
			}
			t.right=n;
			n.left=t;
			n.right=null;
		}
	}
	
	
	public void FindMid()
	{
		Node t=root;
		Node t2=root;
		int count=1;
		while(t2.right!=null)
		{
			t2=t2.right;
			count++;
		}
		System.out.println(count);
		if(count%2==0)
		{
			int t1=count/2;
				while(t!=t2)
				{
					if(t1==0)
					{
						System.out.println(t.data);
					}
					t1--;
					t=t.right;
					t2=t2.left;
				}
		}
		else
		{
		while(t!=t2)
		{
			t=t.right;
			t2=t2.left;
		}
		System.out.println(t.data);
		}
	}
}