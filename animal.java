class Animal
{
	void show()
	{
		System.out.println("this is animal class");
	}
}
class Dog extends Animal
{
		Dog()
		{
			super.show();
		}
    void show()
      {
		System.out.println("this is DOG class");
		}
		public static void main(String s[])
         {
           Dog d=new Dog();
		   d.show();
		  }
}		  
		   