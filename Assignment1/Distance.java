import java.util.*;
class nx
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter x for 1st point");
		double x1=s.nextInt();
		System.out.println("enter y for 1st point");
		double y1=s.nextInt();
		System.out.println("enter x for 2nd point");
		double x2=s.nextInt();
		System.out.println("enter y for 2nd point");
		double y2=s.nextInt();
		System.out.println("enter x for 3rd point");
		double x3=s.nextInt();
		System.out.println("enter y for 3rd point");
		double y3=s.nextInt();
		double a=Math.sqrt(((x2*x2)-(x1*x1))+(((y2*y2)-(y1*y1))));
	    double b=Math.sqrt(((x3*x3)-(x2*x2))+(((y3*y3)-(y2*y2))));
	    System.out.println(a+b);
	
	}
}