class GameDetail
{
	String name;
	int year;
	
	void action()
	{
		System.out.println("This is action game");
	}
	
	void adventure()
	{
		System.out.println("This is adventure game");
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(year);
	}
	
	public static void main(String[] args)
	{
		GameDetail g=new GameDetail();
		
		g.name="PUBG";
		g.year=2018;
		
		g.display();
		g.action();
		g.adventure();
	}
}