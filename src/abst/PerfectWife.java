package abst;

public class PerfectWife extends Wife implements Study{
	
	public PerfectWife(int height, int weight, String cup) {
		super(height, weight, cup);
	}
	
	public  void dance() {
		System.out.println("老鼠爱大米");
	}
	public  void sing() {
		System.out.println("老鼠最爱大米");
	}
	
	public  void surf() {
		System.out.println("浪的飞起");
	}
	public  void drive() {
		System.out.println("老司机");
	}
	
	
}
