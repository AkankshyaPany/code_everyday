package Arraypractice;

public class P20_MaxComsecutive1 {

	public static void main(String[] args) {
		int[] array = {1,0,1,1,0,1,1,1,1};
		
		int count=0;
		int maxcount=0;
		
		for(int i =0;i<array.length;i++) {
			if(array[i]==1) {
				count++;
				//compare count and maxcount
				if(count>maxcount) {
					maxcount=count;					
				}
			}else {
				count=0;
			}
			
		}
		System.out.println("max count of array"+maxcount);

	}

}
