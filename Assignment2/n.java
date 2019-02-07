import java.util.*;
class emp implements Comparable<emp>
{
String name;
int id;
int age;

    emp(int i,String n,int a)
    {
        name=n;
        age=a;
        id=i;
        
    }
    public int compareTo(emp sq)
{
    if((this.age)>(sq.age))
    {
        return 1;
    }
    else
        if((this.age)<(sq.age))
        {
            return -1;

        }
        else
        {
            return 0;
        }  
         
}
public String toString()
    {
        return id+" "+name+" "+age;
    }

}
class n
{
	public static void main(String[] args) {
		TreeSet<emp> e=new TreeSet<emp>();
	Scanner s=new Scanner(System.in);
	System.out.println("enter total");
	int l=s.nextInt();
	int id,age;
	String name;
    for(int i=0;i<l;i++)
	{
		System.out.println("id");
		id=s.nextInt();
		System.out.println("name");
		name=s.next();
		System.out.println("age");
		age=s.nextInt();
		emp ai=new emp(id,name,age);
		e.add(ai);
		
	}
	for(emp sx:e)
	{
		System.out.println(sx);
	}
	e.pollLast();
	System.out.println("second last age "+e.last());
	}
}