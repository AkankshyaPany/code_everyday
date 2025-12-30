package Arraypractice;

import java.util.HashMap;

public class P18_Frequencyofeachelement {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int arr: array) {
			if(!map.containsKey(arr)) {
				map.put(arr, 1);
			}
			else {
				map.put(arr, map.get(arr)+1);
			}
		}
		System.out.println(map);

	}

}
