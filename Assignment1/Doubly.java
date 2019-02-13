package datastructure;

import java.util.Scanner;
class node
{
	int data;
	node next;
	node prev=null;
}
public class Doublyll {
	node head;
    public	void insert(int data)
	{
		node n=new node();
		n.data=data;
		if(head==null)
		{
			head=n;
		}
		else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
		
	}
	void display()
	{
		node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    Doublyll l=new Doublyll();
	    int d=s.nextInt();
	    for(int i=0;i<d;i++)
	    {
	    	int a=s.nextInt();
	    	l.insert(a);
	    }
	    l.display();
	}
}