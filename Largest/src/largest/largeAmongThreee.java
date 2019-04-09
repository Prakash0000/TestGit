package largest;
import java.util.Scanner;
 
public class largeAmongThreee {
	
	 private int a,b,c;
	 
	 public largeAmongThreee() { 
	}
	public void setData(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void  isLarge(int a,int b,int c)
	{
		if (a>b && a>c) 
		{		       
			 System.out.println(a+":Is Greater");
		}
		else if  (b>a && b>c)
		{
			 System.out.println(b+":Is Greater");
		}
		else {
			System.out.println(c+":Is Greater");
		}
	}
      public static void main(String[] args) {
    	  Scanner s= new Scanner(System.in);
    	  int a,b,c; 
    	  largeAmongThreee[] l=new largeAmongThreee[3];
    	  
    	  for(int i=0;i<l.length;i++)
  		{
    		System.out.println("Enter the three numbes");
  			l[i]=new largeAmongThreee();
  			a=s.nextInt();
  			b=s.nextInt();
  			c=s.nextInt();
  			l[i].setData(a,b,c);
  			l[i].isLarge(a, b, c);
  		}
	}
}
