import java.util.Scanner;
class Positive
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number:");
	int a=s.nextInt();
	
	if(a>=0)
	{
	System.out.println("the given number "+a+" is Positive");
	}
	
	else
	{
	System.out.println("the given number "+a+" is Negative");
	}
	}
}