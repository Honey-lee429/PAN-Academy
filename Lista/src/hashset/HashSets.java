package hashset;

import java.util.HashSet;

public class HashSets {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<>();
		cars.add("gol");
		cars.add("fox");
		cars.add("gol");
		cars.add("bmw");
		cars.add("eco");
		
		
		for (String i : cars) {
		System.out.println(i);	
		}
		
		
		System.out.println();
		for (String i : cars) {
			if (i.contains("co")) {
				System.out.println(i);
			}
		}
	}
}
