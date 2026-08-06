import java.util.Scanner;
class Ch
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any character :");
		char name=s.next.CharAt(0);
		
		switch(name)
		{
			case 'A':
			{
			System.out.println("Apple");
			break;
			}
			case 'B':
			{
				System.out.println("Ball");
				break;
			}
			case 'c':
			{
				System.out.println("Cricket");
				break;
			}
			default:
			{
				System.out.println("Invalid Char");
			}
		}
		
	}
}