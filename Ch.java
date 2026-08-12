import java.util.Scanner;
class Ch
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any character :");
		char name=s.next().charAt(0);
		
		switch(name)
		{
			case 'A':
			{
			System.out.println("Air Drop");
			break;
			}
			case 'B':
			{
				System.out.println("BagPack");
				break;
			}
			case 'C':
			{
				System.out.println("Chicken Dinner");
				break;
			}
			case 'D':
			{
			System.out.println("Dacia");
			break;
			}
			case 'E':
			{
			System.out.println("Erangel");
			break;
			}
			case 'F':
			{
			System.out.println("Flare gun");
			break;
			}
			case 'G':
			{
			System.out.println("Gillie Suit");
			break;
			}
			case 'H':
			{
			System.out.println("Helmet");
			break;
			}
			case 'I':
			{
			System.out.println("Ice wall");
			break;
			}
			case 'J':
			{
			System.out.println("Jeep");
			break;
			}
			case 'K':
			{
			System.out.println("K/D Ratio");
			break;
			}
			case 'L':
			{
			System.out.println("Loot");
			break;
			}
			case 'M':
			{
			System.out.println("Molotov");
			break;
			}
			case 'N':
			{
			System.out.println("Nova");
			break;
			}
			case 'O':
			{
			System.out.println("Outfit");
			break;
			}
			case 'P':
			{
			System.out.println("Pan");
			break;
			}
			case 'Q':
			{
			System.out.println("Quickdraw Mag");
			break;
			}
			case 'R':
			{
			System.out.println("Royal Pass");
			break;
			}
			case 'S':
			{
			System.out.println("Scar-L");
			break;
			}
			case 'T':
			{
			System.out.println("TDM");
			break;
			}
			case 'U':
			{
			System.out.println("UAZ");
			break;
			}
			case 'V':
			{
			System.out.println("Vest");
			break;
			}
			case 'W':
			{
			System.out.println("WareHouse");
			break;
			}
			case 'X':
			{
			System.out.println("X-Suit");
			break;
			}
			case 'Y':
			{
			System.out.println("Yellow Flare");
			break;
			}
			case 'Z':
			{
			System.out.println("Zone");
			break;
			}
			default:
			{
				System.out.println("Invalid Char");
			}
		}
		
	}
}