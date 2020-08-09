import java.util.Scanner;
public class insertbefore 
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
	public void printlist()
	{
		Node n2=head;
		while(n2!=null)
		{
			System.out.println(n2.pre+" "+n2.data+" "+n2.next);
			n2=n2.next;
		}
	}
	public void push(int data)
	{
		Node n1=new Node(data);
		if(head==null)
		{
			head=n1;
		}
		else
		{
			n1.next=head;
			head=n1;
			n1.next.pre=n1.next;
		}
	}
	void insertBeforeNode(int data , int node)
	{
		Node n4=new Node(data);
		Node n5=head;
		Node n6=null;
		int i=1;
		if(node==1)
		{
			head.pre=head;
			n4.next=head;
			head=n4;
		}
		else
		{
		while(n5!=null&&n5.next!=null)
		{
			if(i==node)
			{
				n4.next=n6.next;
				n6.next=n4;
				n4.pre=n4;
			}
			i++;
			n6=n5;
			n5=n5.next;
		}
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		insertbefore l=new insertbefore();
		for(int i=0;i<n;i++)
		{
			l.push(s.nextInt());
		}
		int no=s.nextInt();
		l.insertBeforeNode(s.nextInt(),no);
		l.printlist();
	}
}
