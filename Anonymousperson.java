package abstraction;

abstract class Anonymousperson1
{
	abstract void learn();
}
class Anonymousperson 
{
	public static void main(String args[])
	{		
		Anonymousperson1 p=new Anonymousperson1()
		{
			public void learn()
			{
				System.out.println("welcome");
			}
		};
		p.learn();
	}
}