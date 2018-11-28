package extend;

public class BMW extends Car{
	//宝马额外的属性
	private boolean skyWindow;
	//宝马额外的方法
	public void autoDrive(/*int x*/) {
		System.out.println("自动驾驶");
	}
	public BMW() {
		//悄悄执行了下面这句话，调用了父类的空参构造函数
		super();
		System.out.println("子类BMW正在创建对象");
		autoDrive();
		setSkyWindow(true);
	}
	public boolean getSkyWindow() {
		return this.skyWindow;
	}
	public void setSkyWindow(boolean skyWindow) {
		this.skyWindow = skyWindow;
	}
}
