import java.util.*;
class Node
{
	int data;
	Node prev;

	}
class stack
{
	Node top;
	void push(int d)
	{
		Node node=new Node();
		node.data=d;
        if(top==null)
        {
        	node.prev=top;
        	top=node;
        }
        else
        {
        	node.prev=top;
        	top=node;
        }

	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("underflow");
		}
		else
		{
			Node temp=top;
			System.out.println("popped "+temp.data);
			top=top.prev;
			temp=null;
		}
	}
	void print()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	public static void main(String[] args) {
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.pop();
		s.push(30);
		s.print();
	}
}