package Collections;

import java.util.TreeMap;

import java.util.Map;

public class TreeMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap map = new TreeMap();

		map.put(111, "Raj");
		map.put(101, "Ratish");
		map.put(102, "Ravan");
		map.put(103, "Shree");
		map.put(104, "Ganesh");
		map.put(105, "Ramesh");

		System.out.println(map.comparator());
		map.replace(101, "Gopikisan");
		System.out.println(map.firstKey());
		System.out.println("first enrty " + map.firstEntry());
		System.out.println("first value  " + map.pollFirstEntry());
		System.out.println("high entry  " + map.higherEntry(105));
		System.out.println("keys set valeu " + map.keySet());
		System.out.print("Submap   " + map.subMap(101,105));

	}

}
