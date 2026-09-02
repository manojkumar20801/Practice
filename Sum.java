import java.util.Scanner;

class Sum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enetr the Array Size: ");
		int size=s.nextInt();
		int ar[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the inside array value of "+i+" : ");
			ar[i]=s.nextInt();
		}
		
		for(int j=0;j<ar.length;j++)
		{
			sum=sum+ar[j];
			//System.out.println(sum);
		}
		
		System.out.println(sum);
	}
}