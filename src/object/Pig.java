package object;

public class Pig {
	private int age;
	private String name;
	
	public Pig(){
    	System.out.println(super.getClass().getName());
    }
    public Pig(int age,String name){
    	this.age = age;
    	this.name = name;
    	System.out.println("猪肉干");
    }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
