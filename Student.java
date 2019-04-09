package student;

public class Student 
{
		private int rollno;
		private String name;
		private float per;
	    static int cnt=0;
	    
		public Student(int rollno, String name,float per)
		{
			this.name = name;
			this.rollno = rollno;
			this.per=per;
		}
			 public void disp()
			 { 
				System.out.println("Roll Number:" + rollno + ",Name:" + name +",Percentage:"+per);			
	         }
			 public void countObject()
			 {
				System.out.println("Object Count:"+cnt);
				cnt++;
			 }
			 public static void main(String[] args) 
			 {  
				//Array of objects
					Student[] s = new Student[5];
					for (int i = 0; i < s.length; i++)
					{
						s[i] = new Student(i+1,"Prakash"+(i+1),i*10+60);
						s[i].countObject();
						s[i].disp(); 
			       } 
             }
}