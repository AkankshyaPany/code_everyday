package Arraypractice;

public class P13_BinarySearch {
	
	public static void main(String[] args) {
		int[] array = {1,2,5,9,12,14};
		int key=0;
		int start=0;
		int end=array.length-1;
		Boolean found = false;
		while(start<end) {
			int mid = (start+end)/2;
			if(key==array[mid]) {
				found = true;
				System.out.println("present at index : "+mid );
				break;
			}
			else if (key < array[mid]) {
				end= mid-1;
			}
			else {
				start =mid+1;
			}
		}
		if(!found) {
			System.out.println("not found");
		}
				
	}
}
