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
		public static int max3(int a, int b, int c)
		{
			   int max = a;
			   if (b > max) {max = b;}
			   if (c > max) {max = c;}
			   return max;
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
  			System.out.println("Maximun is:"+(max3(a, b, c)));
  		}
	}
}
