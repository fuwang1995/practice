package object;

public class Apple {
	private int price;
	private String version;
	private float size;
	public Apple() 
	{	
		System.out.println("垃圾苹果，太贵了");
	}
	public Apple(int price,String version,float size)
	{
	   this.price = price;
	   this.version = version;
	   this.size = size;
		System.out.println("不如买华为");
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}

}
