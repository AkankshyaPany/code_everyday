package Arraypractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P19_FindDupliacteRemoveDuplicate {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,5,6,6};
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int arr: array) {
			if(!map.containsKey(arr)) {
				map.put(arr, 1);
			}
			else {
				map.put(arr, map.get(arr)+1);
			}
		}
		//print the map
		System.out.println(map);
		
		//print the duplicate in map
		for(Map.Entry<Integer, Integer> en : map.entrySet()) {
			if(en.getValue()>=2) {
				System.out.println(en.getKey() + " it is duplicate");
			}
		}
		//remove duplicate
		HashSet<Integer> set = new HashSet<>();
		for(int arr : array) {
			set.add(arr);
		}
		System.out.println("removed the duplicate "+set);
		
	}

}
