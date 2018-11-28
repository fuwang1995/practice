package thread;

public class ThreaadDemo_1 {
	public static void main(String[] args) {
		Book b1 = new Book(100);
		Book b2 = new Book(100);
		b2.start();
		b1.run();
	}
}
