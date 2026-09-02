import java.util.Scanner;
class Ari 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the A value: ");
		int a=s.nextInt();
		System.out.print("Enter the B value: ");
		int b=s.nextInt();
		
		System.out.println("Addition="+(a+b));
		System.out.println("Subtraction="+(a-b));
		System.out.println("Multiplication="+(a*b));
		System.out.println("Division="+(a/b));
		System.out.println("Remainder="+(a%b));
		}
}