class Rev
{
	public static void main(String[] args)
	{
		Rev r=new Rev();
		r.num(5);
	}
	
	void num(int count)
	{
		if(count>=1)
		{
		System.out.println(count);
		}
		else 
		{
			return;
		}
		
		num(count-1);
		
	}
}