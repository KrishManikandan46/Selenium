package core_Java;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;

public class J25_List {

	public static void arrayList() {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("Cucumber");
		System.out.println(list);

		//list.add(2, "Python");
		//System.out.println(list);

		//list.clear();
		//System.out.println(list);

		//System.out.println(list.get(1));
		//System.out.println(list.isEmpty());
		//System.out.println(list.size());

		//list.remove(0);
		//list.remove("Selenium");
		//System.out.println(list);

		//list.set(2, "Python");
		//System.out.println(list);

		//List<String> list2 = new ArrayList<String>();
		//list2.addAll(list);
		//System.out.println(list);

		/*Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
		}

		ListIterator<String> li = list.listIterator();
		while (li.hasNext()) {
			String string = (String) li.next();
			System.out.println(string);
		}
		while (li.hasPrevious()) {
			String string = (String) li.previous();
			System.out.println(string);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String string : list) {
			System.out.println(string);
		}*/

	}

	public static void linkedList() {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(7);
		linkedList.add(20);
		linkedList.add(46);
		System.out.println(linkedList);

		//linkedList.addFirst(93);
		//linkedList.addLast(99);
		//linkedList.clone();
		//linkedList.clear();
		//System.out.println(linkedList);

		//System.out.println(linkedList.get(0));
		//System.out.println(linkedList.getFirst());
		//System.out.println(linkedList.getLast());
		//System.out.println(linkedList.peekFirst());
		//System.out.println(linkedList.peekLast());

		//linkedList.poll();
		//linkedList.pollFirst();
		//linkedList.pollLast();
		//linkedList.pop();
		//System.out.println(linkedList);

		/*Iterator<Integer> di = linkedList.descendingIterator();
		while (di.hasNext()) {
			Integer integer = (Integer) di.next();
			System.out.println(integer);
		}*/

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayList();
		linkedList();
	}

}
