package core_Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class J27_Map {

	public static void hashMap() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Lionel Messi");
		hashMap.put(7, "MSD");
		hashMap.put(46, "Valentino Rossi");
		System.out.println(hashMap);

		//System.out.println(hashMap.containsKey(4));
		//System.out.println(hashMap.containsValue("Lionel Messi"));
		//System.out.println(hashMap.get(7));
		//System.out.println(hashMap.entrySet());
		//System.out.println(hashMap.keySet());
		//System.out.println(hashMap.values());
	}

	public static void linkedHashMap() {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(10, "Lionel Messi");
		linkedHashMap.put(7, "MSD");
		linkedHashMap.put(46, "Valentino Rossi");
		System.out.println(linkedHashMap);
	}

	public static void treeMap() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(10, "Lionel Messi");
		treeMap.put(7, "MSD");
		treeMap.put(46, "Valentino Rossi");
		System.out.println(treeMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMap();
		//linkedHashMap();
		//treeMap();
	}

}
