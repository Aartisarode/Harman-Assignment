package Assignment2;
public class ExceptionHandling
{
	public static void main(String[] args)
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		try
		{
			if(age < 18 || age >= 60)
				throw new InvalidAgeException("Invalid Age");
				System.out.println("Name: "+name+" Age: "+age);
		} 
		catch (InvalidAgeException e) 
		{
			System.out.println(e);
		}
	}
}
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String age)
	{
		super(age);
	}
}

Fibonnacci Series
package Day1;
public class Fibonacci {
public static void main(String[] args) 
{
    Fibonacci aFibonacci = new Fibonacci();
    aFibonacci.printFiboacciAndAverage(20);
}
private void printFiboacciAndAverage(int n) 
{

    long   fb1 = 1;
    long   fb2 = 1;
    long   fbn = 0;
    long   sum = 0;
    
    if (n <= 0)
    {
        System.out.println("Please correct number of items and try again.");
        return;
    }
    
    System.out.println("The first " + n + " Fibonacci numbers are:");        
    for(int i = 1; i <= n; i++)
    {
        switch (i)
        {
            case 1: fbn = fb1; break;
            case 2: fbn = fb2; break;    
            default:
                fbn = fb1 + fb2;
                fb1 = fb2;
                fb2 = fbn;
        }
        sum += fbn;
        System.out.print(fbn + " ");
    }
    System.out.println(); 
    System.out.printf("The sum is %1$d \n", sum);
    System.out.printf("The average is %.4f \n", (double)sum / n);
}
}

