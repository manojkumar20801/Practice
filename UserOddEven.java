import java.util.Scanner;
class UserOddEven
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number:");
	int a=s.nextInt();
	
	if(a%2==0)
	{
	System.out.println("the given number "+a+" is Even");
	}
	
	else
	{
	System.out.println("the given number "+a+" is Odd");
	}
	}
}