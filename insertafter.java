import java.util.Scanner;
public class insertafter 
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
	void insertAfterNode(int data, int node)
	{
		Node n5=new Node(data);
		Node n3=head;
		int i=1;
		while(n3!=null&&n3.next!=null)
		{
			if(i==node)
			{
				n5.next=n3.next;
				n3.next=n5;
				n5.pre=n5;
			}
			i++;
			n3=n3.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		insertafter l=new insertafter();
		for(int i=0;i<n;i++)
		{
			l.push(s.nextInt());
		}
		int no=s.nextInt();
		l.insertAfterNode(s.nextInt(),no);
		l.printlist();
	}
}
