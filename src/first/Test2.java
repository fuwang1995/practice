package first;

public class Test2 {
	public static void main(String[] args) {
		zhishu(100);
	}

	public static void zhishu(int z) {
		for (int x = 2; x <= z; x++) {
			if (x == 2)
				System.out.print(x+"\t");
			for (int y = 2; y < x; y++) {
				if (x % y == 0)
					break;
				if (x - y == 1)
					System.out.print(x+"\t");
			}
		}
	}
}