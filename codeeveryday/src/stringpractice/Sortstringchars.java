package stringpractice;

public class Sortstringchars {

	public static void main(String[] args) {
		String str="aakankshya";
		String result=sortstring(str);
		System.out.println(result);
	}

	private static String sortstring(String str) {
		char[] array = str.toCharArray();

		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length-1;j++) {
				if (array[i]>array[j]) {
					//swap logic
					char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
				}				
			}			
		}
		return new String(array);
	}

}
