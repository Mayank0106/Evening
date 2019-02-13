package datastructure;

import java.util.Scanner;

public class Circularll {
	node head;
    public	void insert(int data)
	{
		node n=new node();
		n.data=data;
		if(head==null)
		{
			head=n;
			n.next=head;
		}
		else
		{
			node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.next=head;
		}
		
	}
	void display()
	{
		node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
		System.out.println(temp.next.data);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    Circularll l=new Circularll();
	    int d=s.nextInt();
	    for(int i=0;i<d;i++)
	    {
	    	int a=s.nextInt();
	    	l.insert(a);
	    }
	    l.display();
	}
}