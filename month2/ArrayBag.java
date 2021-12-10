public class ArrayBag {
	public void add(int val) {
    arrayAssociative.add(val);
  }
	public void remove(int val) {
    arrayAssociative.remove(val);
  }
	public boolean contains(int val) {
    return arrayAssociative.contains(val);
  }
	public int size() {
    return arrayAssociative.size();
  }
	public boolean isEmpty() {
    return arrayAssociative.isEmpty();
  }
	public String toString() {
    return arrayAssociative.toString();
  }

	ArrayAssociative arrayAssociative = new ArrayAssociative();
}