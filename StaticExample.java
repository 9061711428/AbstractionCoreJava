package abstraction;

public class StaticExample {
	static int count=0;//declare variable as static
	StaticExample()
	{
		count++;//increment value 
		System.out.println(count);
		
	} 
	public static void main(String[] args)
	{
		StaticExample c1=new StaticExample();
		StaticExample c2=new StaticExample();
		StaticExample c3=new StaticExample();
		
	}

}
