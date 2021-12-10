public class ArrayDeque {
  public void addFirst(int val) {
    arraySequence.add(0, val);
  }
  public void addLast(int val) {
    arraySequence.add(arraySequence.size(), val);
  }
  
  public int removeFirst() {
    return arraySequence.remove(0);
  }
  public int removeLast() {
    return arraySequence.remove(arraySequence.size()-1);}

  public boolean isEmpty() {
    return arraySequence.isEmpty();
  }

  public String toString() {
    return arraySequence.toString();
  }

  private ArraySequence arraySequence = new ArraySequence();
}