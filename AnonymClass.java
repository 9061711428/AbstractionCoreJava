package innerclass;


abstract class Anonymousperson1
{
	abstract void learn();
}


public class AnonymClass {
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
