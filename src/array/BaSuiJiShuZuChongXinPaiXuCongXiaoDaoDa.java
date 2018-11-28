package array;

import java.util.Arrays;
import java.util.Random;

public class BaSuiJiShuZuChongXinPaiXuCongXiaoDaoDa {
	public static void main(String[] args) {
		//定义一个数组
		long time1 = System.currentTimeMillis();
		int[] array = new int[10];
		Random random = new Random();
		//将随机数赋值给数组中每个元素
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);;
		}
		//打印排序前数组中的每个元素
		showArray(array);
		System.out.println();
		//排序处理
		getNewArray(array);
		//Arrays.sort(array);	//java官方写好的方法
		//打印排序后数组中的每个元素
		showArray(array);	//自己写的方法
		long time2 = System.currentTimeMillis();
		System.out.println("\n整个运算花费了" + (time2 - time1) + "毫秒");
	}
	
	public static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int[] getNewArray(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j] <= arr[i]) {
                	temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
		return arr;
	}
}
