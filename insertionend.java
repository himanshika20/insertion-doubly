import java.util.Scanner;

public class insertionend 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node pre;
		Node(int x)
		{
			data=x;
			next=null;
			pre=null;
		}
	}
	void insertAtend(int x)
	{
		Node n1=new Node(x);
		Node n2=head;
		if(head==null)
		{
			head=n1;
		}
		else
		{
			while(n2.next!=null)
			{
				n2=n2.next;
			}
			n2.next=n1;
			n2.next.pre=n1;
		}
		
	}
	public void printlist()
	{
		Node n2=head;
		while(n2!=null)
		{
			System.out.println(n2.pre+" "+n2.data+" "+n2.next);
			n2=n2.next;
		}
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	insertionend l=new insertionend();
	for(int i=0;i<n;i++)
	{
		l.insertAtend(s.nextInt());
	}
	l.printlist();
}
}
