import java.util.Scanner;
public class insertionmiddle 
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
	void insertAtMiddle(int x)
	{
		Node n0=new Node(x);
		Node n3=head;
		Node n4=null;
		Node n5=head;
		int count=0;
		while(n3!=null)
		{
			count++;
			n3=n3.next;
		}
		int i=0;
		while(n5!=null)
		{
			if(i==count/2)
			{
				n4.next=n0;
				n0.next=n5;
				n5.pre=n0.next;
				n0.pre=n0;
				
			}
			i++;
			n4=n5;
			n5=n5.next;
		}
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	insertionmiddle l=new insertionmiddle();
	for(int i=0;i<n;i++)
	{
		l.push(s.nextInt());
	}
	l.insertAtMiddle(s.nextInt());
	l.printlist();
}
}
