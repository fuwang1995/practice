package array;

import java.util.Random;

public class ArrayTest1 {

	public static void main(String[] args) {
		//已知条件：Random.nextInt(x)会返回一个随机数
		//范围是[0,x)
		//需求1：创造出一个装有100个随机数的数组（x不要取太小了）
		int[] array =createArray(100);	//定义一个数组
		Random random = new Random();	//创建代表随机数的Random对象
		int count = 0;	//控制生成随机数的个数
		while(count < 100) {
			addNumber(array, 10000);
			count++;	//索引加1
		}
		//循环遍历数组中的每个元素
		forArray(array);
	}
	
	//该用法用于生成一个数组
	//传入参数：length表示数组的长度
	public static int[] createArray(int length) {
		int[] array = new int[length];
		return array;
	}
	
	//该用法用于生成一个随机数
	//传入参数：bound表示产生的随机数的范围，即范围为[0,bound)
	public static int getRandom(int bound) {
		Random random = new Random();
		return random.nextInt(bound);
	}

	//该用法用于遍历数组
	public static void forArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	//该用法用于将数组添加满随机数
	public static int[] addNumber(int[] arr, int bound) {
		for (int i = 0; i < arr.length; i++) {
			int xxx = getRandom(bound);
			arr[i] = xxx;
		}
		return arr;
	}
}
