package first;

public class Test1 {
	public static void main(String[] args) {
		int a = 20;
		int b = 50;
		getMax1(a, b);
		int result = getMax2(a, b);
		System.out.println(result);
	}
	
	//这个方法无返回值
	public static void getMax1(int a, int b) {
		if (a > b) {
			System.out.println(a + "比较大 ");
		} else {
			System.out.println(b + "比较大 ");
		}
	}
	
	//这个方法you返回值
	public static int getMax2(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
