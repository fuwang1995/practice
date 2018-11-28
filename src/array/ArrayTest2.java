package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] array = new int[20];
		array = addNumbers(array);
		showNumbers(array);
	}

	/*public static int Faker(int[] arr) {
		// faker 无缘s8
		int x = 0;
		for (x = 0; x <= arr.length; x++) {
			int num = arr[x];
			num = 1;
		}
		return arr[x];
	}*/
	
	//为数组的每个元素赋值
	public static int[] addNumbers(int[] array) {
		//经过一系列处理之后
		//把传进来的数组进行加工，然后返回给main方法
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;	//把1赋值给每个元素
		}
		return array;
	}
	
	//打印显示数组中的每个元素
	public static void showNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
