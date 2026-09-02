import java.util.Scanner;

class Count
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;

		System.out.println("Enter the Size of array: ");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Array"+i +"Value: ");
			arr[i]=s.nextInt();
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==40)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}