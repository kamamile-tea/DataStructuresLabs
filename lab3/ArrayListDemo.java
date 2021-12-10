package lab3;

public class ArrayListDemo {
	public static void main(String [] args) {
		ListDemo.basics(new ArrayList<Object>());
		ListDemo.capacityManagement(new ArrayList<Object>());
		ListDemo.exceptionHandling(new ArrayList<Object>());
		ListDemo.generics(new ArrayList<Integer>(), new ArrayList<String>(), new ArrayList<java.util.Stack<Double>>());
	}
}

