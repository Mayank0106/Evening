import java.util.*;
class Node
{
	int data;
	Node next=null;
}
class l{
Node head;
public void insert(int d)
{
	Node node=new Node();
	node.data=d;
	if(head==null)
	{
		head=node;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}
public void i(int dx)
{
	Node node=new Node();
	node.data=dx;
	node.next=head;
	head=node;
}

public void ias(int i,int x)
{
	Node node=new Node();
	node.data=x;
	Node n=head;
	for(int ix=0;ix<i-1;ix++)
	{
		n=n.next;
	}
	node.next=n.next;
	n.next=node;
}
public void deleteNode(int ix) 
    { 
         
        if (head == null) 
            return; 
        Node temp = head; 
       if (ix == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        } 
    for (int i=0; temp!=null && i<ix-1; i++) 
            temp = temp.next; 
     if (temp == null || temp.next == null) 
            return; 
        Node next = temp.next.next; 
        temp.next = next;  // Unlink the deleted node from list 
    }
     public void reverse() { 
        Node p1 = null; 
        Node p2 = head; 
        Node p3 = null; 
        while (p2 != null) { 
            p3 = p2.next; 
            p2.next = p1; 
            p1 = p2; 
            p2 = p3; 
        } 
        head = p1; 
        
    } 
public void display()
{
	Node n=head;
	while(n!=null)
	{
		System.out.print(n.data+" ");
		n=n.next;
	}
}
public static void main(String[] args) {
 	l a=new l();
 	Scanner s=new Scanner(System.in);
 	System.out.println("enter value");
 	int x=s.nextInt();
 	while(x>0)
 	{
 		a.insert(x);
 		System.out.println("enter value");
 		x=s.nextInt();
 	}
 	a.display();
 	a.i(45);
 	System.out.println();
 	a.display();
 	a.ias(2,55);

 	System.out.println();
 	a.display();
 	a.deleteNode(2);

 	System.out.println();
 	a.display();
 	a.reverse();

 	System.out.println();
 	a.display();
 } 
}