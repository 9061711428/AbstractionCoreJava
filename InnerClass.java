package innerclass;
class InnerClass
{
	private int a=20;
	class inner1
	{
		public void fun()
		{
			System.out.println(a);
		}
	}
	public static void main(String args[])
	{
		InnerClass obj=new InnerClass();//invoke object of Innerclass
		InnerClass.inner1 ob=obj.new inner1();
		ob.fun();
	}
}
