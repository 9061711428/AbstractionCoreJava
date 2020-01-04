//Example for anonymous class
package innerclass;
abstract class Anonymousperson1//abstract class
{
	abstract void learn();//abstract method
}
public class AnonymClass
{
	public static void main(String args[])
	{		
		Anonymousperson1 p=new Anonymousperson1()//object of Anonymous class
		{
			public void learn()
			{
				System.out.println("welcome");
			}
		};
		p.learn();
	}

}
