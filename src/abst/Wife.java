package abst;

public abstract class Wife {
	public int height;
	public int weight;
	public String cup;
	public Wife(int height, int weight, String cup) {
		this.height = height;
		this.weight = weight;
		this.cup = cup;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCup() {
		return cup;
	}
	public void setCup(String cup) {
		this.cup = cup;
	}
	@Override
	public String toString() {
		return "Wife [height=" + height + ", weight=" + weight + ", cup=" + cup + "]";
	}
	
}
