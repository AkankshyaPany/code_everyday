package stringpractice;

import java.util.Arrays;

public class P9_AnagramString {

	public static void main(String[] args) {
		String str1 = "rest";
		String str2 = "tesr";
	    Boolean anagram = CheckAnagram(str1,str2);
	    System.out.println(anagram);
	}

	private static Boolean CheckAnagram(String str1, String str2) {
		
		//to char array 
		char[] str1new =str1.toCharArray();
		char[] str2new =str2.toCharArray();
				
		Arrays.sort(str1new);	
		Arrays.sort(str2new);	
		
		if(Arrays.equals(str1new, str2new)) {
			return true;
		}else {
			return false;
		}

	}

}
