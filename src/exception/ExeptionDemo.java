package exception;

//需求：毕老师用电脑讲课
 /*老师:
    	属性:姓名
    	行为：用电脑讲课
	电脑：
		行为：运行
*/



class LanpingException extends Exception{
	public LanpingException() {}
	public  LanpingException(String message) {
		super(message);	
	}
}

class Nootbook{
	int system =1;
	public void method()throws LanpingException
	{		
			System.out.println("run.....");
		if(system ==1)
		throw new LanpingException("蓝屏了 ");
		
	}
}

class Teacher{
	private String name;
	public Teacher(String name) {
		this.name = name;
	}
	public void teach(){	
		Nootbook n = new Nootbook();
		try {	
			n.method();
			
		}
		catch(LanpingException e) 
		{	
			System.out.println(e.toString());
			//e.printStackTrace();
			int system = 1;
			System.out.println("重启");
		}
		System.out.println("讲课");
	}
}

public class ExeptionDemo {
	public static void main(String[] args) {
		Teacher t = new Teacher("毕");
		t.teach();
		
	}
}




