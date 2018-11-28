package extend;

public class Car {
	private int price;
	private String name;
	public Car() {
		System.out.println("父类Car正在创建对象");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

