class SprCls
{
	SprCls()
	{
		System.out.println("super class");
	}
	void displ()
	{
		System.out.println("Display() of super class");
	}
}
class Sub extends SprCls
{
	Sub()
	{
		System.out.println("Sub Class");
	}
		public static void main(String s1[])
		{
			Sub s=new Sub();
			s.displ();
		}
}		
			