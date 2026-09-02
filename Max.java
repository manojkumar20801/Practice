import java.util.Scanner;
class Max
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int max=0;
		
		System.out.println("Enetr the Array Size: ");
		int size=s.nextInt();
		int ar[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the inside array value: ");
			ar[i]=s.nextInt();
		}
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}
		System.out.println(max);
		
	}
}