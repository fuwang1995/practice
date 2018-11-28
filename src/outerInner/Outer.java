package outerInner;

public class Outer {
	
	public  int  x = 0;
	
	class Inner extends Object{
		public void show() {
			System.out.println("Hello World");
		}
	}
	
	public static void main(String[] args) {
		new Outer().new Inner().show();
	}
}
/*class B{
		
public mathod() {	
	new Object() 
	{
		public void show()
		{
		  System.out.println("hello  world");
		}.show();
	}
	}

}*/