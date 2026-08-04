import java.util.Scanner;
class Bank
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	Scanner i=new Scanner(System.in);
	System.out.println("****Check The Bank Loan Eligibility****");
	System.out.print("Enter your Name : ");
	String name=s.nextLine();
	System.out.print("Enter your Age : ");
	int age=i.nextInt();
	System.out.print("Enter your Salary : ");
	int salary=i.nextInt();
	System.out.print("Enter your Cibil Score : ");
	int cibil=i.nextInt();
	System.out.print("Are you an Existing Customer(True/False) : ");
	Boolean cust=s.nextBoolean();
	
	if(age>=21)
	{
		if(salary>=20000)
		{
			if(cibil>=750)
			{
				if(cust)
				{
				System.out.print("\n"+name+" you are Eligible for Premium Loan \n");
				}
				else
				{
				System.out.print("\n"+name+" you are Eligible for Stanard loan \n");
				}
			}
			else if(cibil>=650 && cibil<=749)
			{
			System.out.print("\n"+name+" you are for Eligible Low Amount \n");
			}
			else
			{
			System.out.print("\n"+name+" you are not Eligible (Low cibil Score)\n");
			}
		}
		else
		{
		System.out.print("\n"+name+" you are not Eligible (Low Salary)\n");
		}
	}
	else
	{
	System.out.print("\n"+name+" you are not Eligible (Age criteria not matched) \n");
	}
	
	}
}