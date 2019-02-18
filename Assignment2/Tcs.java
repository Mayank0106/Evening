import java.util.*;
class student
{
String name;
String city;
int id;
double marks;
static int j=0;
    student(int i,String n,String c,double m)
    {
        name=n;
        marks=m;
        id=i;
        city=c;
        
    }
   public static student[] check(student[] ax,String ccity,double cmarks)
   {
  	student[] axx=new student[ax.length];
  	
   for(int i=0;i<ax.length;i++)
   	{
   		if((ax[i].city).equals(ccity))
   		{
   		if((ax[i].marks)==(cmarks))
   		{
   			axx[j]=ax[i];
   			j++;
   		}	
   		}
   	}/*
   	System.out.println(ax[0].id+" "+ax[1].id+" "+ax[2].id);
   */
   	return axx;
   }

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter total");
	int l=s.nextInt();
	int id;
	double marks;
	String name,city;
    student[] ax=new student[l];
    student[] aax=new student[l];
    for(int i=0;i<l;i++)
    {
    	//System.out.println("id");
		id=s.nextInt();
		//System.out.println("name");
		name=s.next();
		//System.out.println("city");
		city=s.next();
		//System.out.println("marks");
		marks=s.nextDouble();
		student ai=new student(id,name,city,marks);
		ax[i]=ai;
    }
    //    System.out.println("ccity");
		String ccity=s.next();
	//	System.out.println("cmarks");
		double cmarks=s.nextDouble();
		aax=check(ax,ccity,cmarks);
        for (int i = 0; i < j  ; i++)  
        { 
            for (int k = 0; k < j - i - 1; k++)  
            { 
                if (aax[k].id > aax[k + 1].id)  
                { 
                    int tempid = aax[k].id; 
                    aax[k].id = aax[k + 1].id; 
                    aax[k + 1].id = tempid;
                    String tempname = aax[k].name; 
                    aax[k].name = aax[k + 1].name; 
                    aax[k + 1].name = tempname;
                    String tempcity = aax[k].city; 
                    aax[k].city = aax[k + 1].city; 
                    aax[k + 1].city = tempcity;
                    double tempmarks = aax[k].marks; 
                    aax[k].marks = aax[k + 1].marks; 
                    aax[k + 1].marks = tempmarks; 
               } 
            } 
		for( i=0;i<j;i++)
		{
        System.out.println(aax[i].id+" "+aax[i].name+" "+aax[i].city+" "+aax[i].marks+" ");	
		}
		
    }
}
}