package array;

public class MulTable {
	public static void main(String[] args) {
		getMulTable(14);
	}
	public static void  getMulTable(int length) {
		for (int x = 1; x < length; x++) {
			for (int i = 1; i <= x; i++) {
				System.out.print(i+"×"+x+"="+x*i+" \t" );
			}
			System.out.println();
		}
	}
}
