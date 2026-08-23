class ArrayMinMax
{
	public static void main(String[] args)
	{
		int ar[]={9,13,8,5,15,8,1,8,10};
		int min=0;
		int max=ar[0];
		int count=0;
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>min)
			{
				min=ar[i];
			}
		}
		System.out.println(min);
		
		
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]<max)
			{
				max=ar[j];
			}
		}
		System.out.println(max);
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==8)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}