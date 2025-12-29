package Arraypractice;

public class P16_SecondlargestOfArray {

	public static void main(String[] args) {
		int[] array= {1,2,3,4};
		int max=array[0];
		int seconmax =array[1];
		for(int i=2;i<=array.length-1;i++) {
			if(array[i]>max) {
				seconmax=max;
				max=array[i];	
			}
			if(array[i]>seconmax && array[i]!=max) {
					seconmax= array[i];
				}
		}
		System.out.println("maximum is:"+max+"   and    "+"secondmaximum is:"+seconmax);

	}

}
