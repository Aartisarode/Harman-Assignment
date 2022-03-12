package Assignment2;
import java.util.*;

public class GradeCheck
{
	public static void main(String[] args)
	{	int avg=0;int x = 0;
		int array[]= new int[20];
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) 
		{	System.out.println("Enter the grade of student"+i);
			if(0<=n && n<=100) 
			{x=sc.nextInt();
				System.out.println("it is in grade");
				avg+=x;
			}
			else
			{
				System.out.println("Invalid grade,try again");
				i=i-1;
			}
		}
		avg = avg/n;
		System.out.println("The average is "+ avg);
	}
}
