package stringpractice;

import java.util.HashMap;

public class P6_learninghashmap {

	public static void main(String[] args) {
		String str = "WELCOME";
		HashMap<Character, Integer> map = duplicateelement(str);
        System.out.println(map);
        //how to convert map to string
        StringBuilder s = new StringBuilder();
        for(char ch : map.keySet()) {
        	if(map.get(ch)==1) {
  			  s.append(ch);
  			}	
        }
        //printing after removing duplicate character
        System.out.println(s.toString());
	}

	private static HashMap<Character, Integer> duplicateelement(String str) {
		HashMap<Character, Integer> map =new HashMap<>();
		char[] array = str.toCharArray();
		for(char ch : array) {
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}else {
				map.put(ch,map.get(ch)+1);
			}
		}
		 System.out.println(map);
		//replace frequency is 2 to 0
		for(char ch :map.keySet()) {
			if(map.get(ch)>1) {
			  map.replace(ch,0);
			}			
		}
		return map;
	}

}
