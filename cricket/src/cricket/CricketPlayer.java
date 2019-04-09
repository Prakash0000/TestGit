package cricket;
import java.util.Scanner;

public class CricketPlayer
{	
	private int noInnings;
	private int totalRun;
	private int noNotOut;
	private float batAvg;
	private String cName;
	
	public CricketPlayer()
	{ 
		
	}
	public void  setData(String cName,int noInnings, int totalRun,int noNotOut)
	{
		this.noInnings=noInnings;
		this.totalRun=totalRun;
		this.cName=cName;
		this.noNotOut=noNotOut;
		this.batAvg=0;
	}
	
	public static float findAvg(int noInnings,int totalRun) 
	{
		float avg=totalRun/noInnings;
		return avg;
	}
	public static void sort(CricketPlayer c[],int n)
	{
		CricketPlayer temp;
		for(int i=0;i<n;i++)
		{
			for (int j = i+1; j <n; j++) 
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
	}
	public void disp()
	{
		System.out.println("Cricketer Name"+cName);
		System.out.println("Number of Innings:"+noInnings);
		System.out.println("Number of Times Not out"+noNotOut);
		System.out.println("Total runs:"+totalRun);
		System.out.println("Batting Avg:"+(findAvg(noInnings, totalRun)));
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Scanner s= new  Scanner(System.in);
		System.out.println("How many record you want to enter");
		int number = s.nextInt();
		
		CricketPlayer[] c= new CricketPlayer[number];
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println("Enter the Name of Cricketer"); 
			String cName=s.next();
			System.out.println("Enter the Number of Innings Played by the Cricketer"); 
			int noInnings=s.nextInt();
			System.out.println("How many times Cricketer is not out"); 
			int noNotOut=s.nextInt();
			System.out.println("Enter the Total Runs Scored by Cricketer"); 
			int  totalRun=s.nextInt();
			c[i]=new CricketPlayer();
			c[i].setData(cName, noInnings, totalRun, noNotOut);  
		}
		int n=c.length;
		CricketPlayer.sort(c,n);
		
		for (int i = 0; i < n; i++) 
		{
			c[i].disp();
		}
	}

}
