package stringpractice;

import java.util.HashMap;

public class P5_Occuranceofeachchar {

	public static void main(String[] args) {
		String str = "morning";
		char[] character = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		//agar map me nhi h to put
		for (char ch : character) {
			if (!map.containsKey(ch)) {
			    map.put(ch, 1);
			} else {
			    map.put(ch, map.get(ch) + 1);
			}
		}
		System.out.println(map);
	}

}
