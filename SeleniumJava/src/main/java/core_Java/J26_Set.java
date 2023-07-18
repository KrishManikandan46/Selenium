package core_Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class J26_Set {

	public static void hashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Java");
		hashSet.add("Selenium");
		hashSet.add("Cucumber");
		hashSet.add("Java");
		System.out.println(hashSet);
	}

	public static void linkedHashSet() {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(7);
		linkedHashSet.add(20);
		linkedHashSet.add(46);
		linkedHashSet.add(10);
		System.out.println(linkedHashSet);
	}

	public static void treeSet() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(7);
		treeSet.add(46);
		treeSet.add(20);
		System.out.println(treeSet);

		//System.out.println(treeSet.first());
		//System.out.println(treeSet.last());
		//System.out.println(treeSet.subSet(7,46));
		//System.out.println(treeSet.headSet(10));
		//System.out.println(treeSet.higher(10));
		//System.out.println(treeSet.lower(10));
		//System.out.println(treeSet.descendingSet());

		//System.out.println(treeSet.pollFirst());
		//System.out.println(treeSet.pollLast());
		//System.out.println(treeSet);

		//treeSet.remove(10);
		//System.out.println(treeSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashSet();
		//linkedHashSet();
		treeSet();
	}

}
