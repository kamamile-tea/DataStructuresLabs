package lab3;

import java.util.Random;

public class ListDemo {
	static void basics(List<Object> list) {
		System.out.println("=== List Demo ===");
		System.out.println("=== Basics");
		System.out.println("--- Initial (empty) container");
		System.out.println("--- toString");
		System.out.println(list);

		System.out.println("Some appends");
		System.out.print("add(list.size(), \"Hello\")");
		list.add(list.size(), "Hello");
		System.out.println(" -> " + list);
		System.out.print("add(list.size(), 14)");
		list.add(list.size(), 14);
		System.out.println(" -> " + list);
		System.out.print("add(list.size(), true)");
		list.add(list.size(), true);
		System.out.println(" -> " + list);
		System.out.print("add(list.size(), 12.5)");
		list.add(list.size(), 12.5);
		System.out.println(" -> " + list);

		System.out.println("--- set ... overwriting these diverse types with Integers");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("set(" + i + ", " + (i*100) + ")");
			list.set(i, i * 100); 
			System.out.println(" -> " + list);
		}

		System.out.println("--- get");
		for (int i = 0; i < list.size(); i++)
			System.out.println(i + ": " + list.get(i) + (i < list.size()-1 ? ", " : ""));

		System.out.println("--- Removes from end till empty");
		while (!list.isEmpty()) {
			Object value = list.remove(list.size()-1);
			System.out.println("Removed: " + value + " -> " + list);
		}

		Random random = new Random(12345);
		System.out.println("Some random insertions");
		for (int i = 0; i < list.capacity(); i++) {
			int pos = random.nextInt(list.size()+1);
			System.out.print("add(" + pos + ", "+ i);
			list.add(pos, i);
			System.out.println(" -> " + list);
		}
		
		System.out.println("Now remove them at random until empty");
		while (!list.isEmpty()) {
			int pos = random.nextInt(list.size());
			System.out.print("remove(" + pos + ")");
			System.out.print(list.remove(pos));
			System.out.println(" -> " + list);
		}
	}

	static void capacityManagement(List<Object> list) {
		System.out.println();
		System.out.println("=== Capacity Management ===");
		System.out.println("--- Initial (empty) container");
		System.out.println(list);

		System.out.println("Adding 4 times initial capacity elements + 1");
		int initialCapacity = list.capacity();
		for (int i = 1; i <= 4 * initialCapacity+1; i++) {
			int lastCapacity = list.capacity();
			System.out.print("Appending " + i);
			list.add(list.size(), i);
			System.out.println(" -> " + list);
			if (lastCapacity != list.capacity()) {
				System.out.println("(list was resized to: " + list.capacity() + ")");
				lastCapacity = list.capacity();
			}
		}
	}		

	static void exceptionHandling(List<Object> list) {
		System.out.println();
		System.out.println("=== Exception Handling  various erroneous operations will now be attempted ===");
		System.out.println("--- Initial (empty) container");
		System.out.println(list);

		try {
			System.out.print("get(0) ... ");
			list.get(0);
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("set(0, \"Hello\") ... ");
			list.set(0, "Hello");
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("remove(0) ... ");
			list.remove(0);
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		System.out.print("Adding an element");
		list.add(list.size(), "Hello");
		System.out.println(list);

		try {
			System.out.print("add(list.size()+1, \"Hello\") ... ");
			list.add(list.size()+1, "Hello");
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("remove(list.size()) ... ");
			list.remove(list.size());
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("get(-1) ... ");
			list.get(-1);
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("get(list.size()) ... ");
			list.get(list.size());
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("set(-1, \"Hello\") ... ");
			list.set(-1, "Hello");
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}

		try {
			System.out.print("set(list.size(), \"Hello\") ... ");
			list.set(list.size(), "Hello");
			exceptionError();
		} catch (CollectionException e) {
			System.out.println(" exception was thrown");
		}
	}

	static void exceptionError() {
		System.out.println("*** Error *** Expected CollectionException error not thrown");
		System.exit(1);
	}

	static void generics(List<Integer> integerList, List<String> stringList, List<java.util.Stack<Double>> doubleStackList) {
		System.out.println();
		System.out.println("=== Integer element type");
		Integer [] integerArray = {10, 20, 30, 40, 50};
		testInstantiatedGeneric(integerList, integerArray);

		System.out.println(); 

		System.out.println("=== String element type");
		String [] stringArray = {"First", "Second", "Third"};
		testInstantiatedGeneric(stringList, stringArray);

		System.out.println(); 

		System.out.println("=== java.util.Stack<Double> element type");
		java.util.Stack<Double> [] stackArray = new java.util.Stack[2];
		stackArray[0] = new java.util.Stack<Double>();
		stackArray[0].push(1.1);
		stackArray[0].push(1.2);
		stackArray[1] = new java.util.Stack<Double>();
		stackArray[1].push(2.1);
		stackArray[1].push(2.2);
		stackArray[1].push(2.3);
		testInstantiatedGeneric(doubleStackList, stackArray);
	}

	static <E> void testInstantiatedGeneric(List<E> list, E [] array) {
		System.out.println("--- Sequential insertions (append)"); 
		for (var e : array) {
			System.out.println("Inserting " + e + " at " + list.size());
			list.add(list.size(), e);
		}
		System.out.println(list);

		System.out.println(); 

		System.out.println("--- Reverse (tests get, set, size)"); 
		reverse(list, 0, list.size()-1);
		System.out.println(list);
	}

	static <E> void reverse(List<E> list, int lb, int ub) {
		if (lb > ub) return;
		E t = list.get(lb);
		list.set(lb, list.get(ub));
		list.set(ub, t);
		reverse(list, lb+1, ub-1);
	}
}
		


