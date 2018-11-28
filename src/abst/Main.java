package abst;

public class Main {
	public static void main(String[] args) /*throws Exception*/ {
		PerfectWife xiaoBinDe = new PerfectWife(170,105,"c");
		PerfectWife aMei = new PerfectWife(170,130,"d");
		System.out.println(xiaoBinDe.getHeight()+"\t"+xiaoBinDe.getWeight()+"\t"+xiaoBinDe.getCup());
		System.out.println(aMei.getHeight()+"\t"+aMei.getWeight()+"\t"+aMei.getCup());
		aMei.dance();
		xiaoBinDe.sing();
		
		//...
		
		/*int abc = 1;
		if (abc == 1) {
			throw new Exception("abc=1是错误的");
		}*/
	}
}
