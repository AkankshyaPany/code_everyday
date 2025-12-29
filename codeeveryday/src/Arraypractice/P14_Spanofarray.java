package Arraypractice;

public class P14_Spanofarray {

	public static void main(String[] args) {
		// SPAN=MAX-MIN of an array
		int[] array = {1,2,3,4,5,0};
		int result = spanofarray(array);
		System.out.println(result);

	}

	private static int spanofarray(int[] array) {
		//find max of array
		int max=0;
		for(int i=1;i<array.length-1;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}		
		//find min of array
		int min=0;
		for(int i=1;i<array.length-1;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		int span = max-min;
		return span;
	}

}
