package Arraypractice;
import java.util.Arrays;

public class P11_ReverseArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,2};
		int start = 0;
		int end = array.length-1;
		int[] reversed= reverse(start,end,array);
		System.out.println(Arrays.toString(reversed));

	}

	private static int[] reverse(int start, int end, int[] array) {
		while(start<=end) {
			int temp =array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		return array;
	}

}
