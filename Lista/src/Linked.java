import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("ecosport");
		cars.add("mercedes");
		cars.add("fox");
		cars.add("gol");
		System.out.println(cars.contains("gol"));
		
		
		cars.addFirst("palio");
		cars.addLast("mazda");
		System.out.println(cars);
		cars.removeLast();
		System.out.println(cars.get(0));
		System.out.println(cars.getLast());
		cars.clear();
		System.out.println(cars);
		
		LinkedList<String> list = new LinkedList<>();
		list.add("geedk");
		list.add("for");
	}
}
