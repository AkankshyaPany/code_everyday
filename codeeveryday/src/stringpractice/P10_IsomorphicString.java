package stringpractice;

import java.util.HashMap;

public class P10_IsomorphicString {

	public static void main(String[] args) {
		
		System.out.println(isIsomorphic("egg","add"));
		System.out.println(isIsomorphic("egg","adi"));

	}
		private static boolean isIsomorphic(String s1, String t1) {
		    if (s1.length() != t1.length()) {
		        return false;
		    }

		    HashMap<Character, Character> s1map1t1 = new HashMap<>();
		    HashMap<Character, Character> t1map1s1 = new HashMap<>();

		    for (int i = 0; i < s1.length(); i++) {
		        char ch1 = s1.charAt(i);
		        char ch2 = t1.charAt(i);

		        // Check s1 -> t1 mapping
		        if (s1map1t1.containsKey(ch1)) {
		            if (s1map1t1.get(ch1) != ch2) {
		                return false;
		            }
		        } else {
		            s1map1t1.put(ch1, ch2);
		        }

		        // Check t1 -> s1 mapping
		        if (t1map1s1.containsKey(ch2)) {
		            if (t1map1s1.get(ch2) != ch1) {
		                return false;
		            }
		        } else {
		            t1map1s1.put(ch2, ch1);
		        }
		    }

		    return true;
		}

}
