package student;
import java.util.Scanner;

public class Student
{
	private static int r;
	private int rollno;
	private String name;
	private float per; 
	
	public Student()
	{
		r=0;
		name="";
		rollno=0;
		per=0;
	}
	
	public void setData(String name,float prec)
	{
		this.rollno=r;
		this.name=name;
		this.per=prec;
		r++;
	}
	
	public void disp()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Percentage:"+per);
		System.out.println("\n");
	}
	
	public static void sort(Student array[],int n)
	{
		Student temp; 
	for(int i=0;i<n;i++)
		 {
		  for(int j=i+1;j<n;j++)
		   {
		   	temp=array[i];
		   	array[i]=array[j];
		   	array[j]=temp;
		   }
		 }
	}
	public static void main(String args[])
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("how many Students:");
		int number = s.nextInt();
		
		Student[] array=new Student[number];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter the Name and Percentage");
			String name = s.nextLine(); 
			float perc= s.nextFloat();
			array[i]=new Student();
			array[i].setData(name,perc);
		}
		
		int n=array.length;		//calculate length of array
		Student.sort(array,n);//sort the objects
		
		for(int i=0;i<array.length;i++)
		{	
			array[i].disp();//disp detail of object
		}
	}
}
