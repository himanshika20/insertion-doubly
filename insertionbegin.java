import java.util.Scanner;
public class insertionbegin 
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
	void insertAtbegin(int x)
	{
		Node n1=new Node(x);
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
	public void printlist()
	{
		Node n2=head;
		while(n2!=null)
		{
			System.out.println(n2.data+" "+n2.next+" "+n2.pre);
			n2=n2.next;
		}
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	insertionbegin l=new insertionbegin();
	for(int i=0;i<n;i++)
	{
		l.insertAtbegin(s.nextInt());
	}
	l.printlist();
}
}
