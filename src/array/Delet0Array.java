package array;

public class Delet0Array {

	public static void main(String[] args) {
		int[] oldArr = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int length=getLength(oldArr);
		int[] newArr=getNewArr(length,oldArr);
		print(newArr);
	}

	// 得到新数组的长度。
	public static int getLength(int[] array) {
		int length = 0; // 老数组中不为0的元素的个数
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				length++;
			}
		}
		return length;
	}

	//得到去0后的新的数组。
	public static int[] getNewArr(int len, int[] oldArayr) {
		int[] newArr = new int[len];
		int x = 0;
		for (int i = 0; i < oldArayr.length; i++) {
			if (oldArayr[i] != 0) {
				newArr[x] = oldArayr[i];
				x++;
			}
		}
		return newArr;
	}
	//打印新数组里面的每个元素。
	public static  void print(int[] newArr){
		for (int i = 0; i < newArr.length; i++) {
			if(i!=newArr.length-1)
			System.out.print(newArr[i]+",");
			else
				System.out.print(newArr[i]);
		}	
	}
}
