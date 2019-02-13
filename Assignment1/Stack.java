import java.util.*;
class s
{
	int a[]=new int[10];
	static int i=0;
	void push(int d)
	{
		if(i>=10)
		{
			System.out.println("overflow");
		}
		else
		{
		a[i]=d;
		i++;	
		}
	}
	void pop()
	{   
		if(i<=0)
		{
			System.out.println("underflow");
		}
		else
		{
		a[i-1]=0;
		i--;
		}
	}
	void display()
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(a[j]);
		}
	}
	void peek()
	{
		System.out.print(a[i]);
	}
	void size()
	{
			System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner sx=new Scanner(System.in);
		s q=new s();
		q.pop();
		for(int x=0;x<10;x++)
		{
			System.out.println("enter value");
			int w=sx.nextInt();
			q.push(w);
		}
		q.push(10);
		q.pop();
		q.pop();
		System.out.print("bottom ");
		q.display();
		System.out.print(" top");
		q.peek();
		q.size();

	}
}