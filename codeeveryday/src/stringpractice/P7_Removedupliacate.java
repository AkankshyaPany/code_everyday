package stringpractice;

import java.util.Arrays;
import java.util.HashSet;

public class P7_Removedupliacate {

	public static void main(String[] args) {
		String str = "dixkjmcce";
		char[] array = str.toCharArray();
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		
		HashSet<Character> set = new HashSet<>();
		for(char ch : array) {
			set.add(ch);
		}
		System.out.println(set);
		
		//set to string
		StringBuilder s= new StringBuilder();
		for(char ch : array) {
			s.append(ch);
		}
		System.out.println(s);
	}
	
}
