package stringpractice;

public class P4_Reversecharacterofstring {

	public static void main(String[] args) {
	 String str=" siii rd  ";
	 String result = reverseString(str);
     System.out.println(result);
	}

	private static String reverseString(String str) {
		char[] array = str.trim().toCharArray(); //covertinf string to char array
		int start=0;
		int end=array.length-1;
		while(start<=end) {
			char temp =array[start];
			array[start] =array[end];
		    array[end] = temp;
			start++;
			end--;
		}
		return new String(array); //char array to string
	}

}
