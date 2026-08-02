class Operator
{
	public static void main(String[] args)
	{
	String oper="Subtraction";
	int a=10;
	int b=20;
	
	if(oper=="addition")
	{
	System.out.println("Addition="+(a+b));
	}
	
	else if(oper=="Subtraction")
	{
	System.out.println("Subtraction="+(a-b));
	}
	
	else if(oper=="Multiplication")
	{
	System.out.println("Multiplication="+(a*b));
	}
	
	else if(oper=="Division")
	{
	System.out.println("Division="+(a/b));
	}
	
	else
	{
	System.out.println("Invalid Choice");
	}
	}
}