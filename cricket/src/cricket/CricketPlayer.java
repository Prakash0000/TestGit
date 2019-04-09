package cricket;
import java.util.Scanner;

public class CricketPlayer {
	public static void main(String[] args) {
		Scanner s= new  Scanner(System.in);
		System.out.println("How many record you want to enter");
		int number = s.nextInt();
		
		Cricket[] c= new Cricket[number];
		for (int i = 0; i < c.length; i++) 
		{
			String name=s.next();
			c[i]=new Cricket("")
		}
	}

}
