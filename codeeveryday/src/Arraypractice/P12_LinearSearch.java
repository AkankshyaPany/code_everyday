package Arraypractice;

public class P12_LinearSearch {

	public static void main(String[] args) {
		int[] array = {1,2,5,9,2,6};
		int key=5;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==key) {
				System.out.println(array[i]+ " is present at index : "+ i);
			}
		}

	}

}
