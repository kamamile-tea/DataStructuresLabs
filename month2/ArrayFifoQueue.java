public class ArrayFifoQueue {
  public void add(int val) {
    arraySequence.add(arraySequence.size(), val);
  }
  public int remove() {
    return arraySequence.remove(0);
  }
  public boolean isEmpty() {
    return arraySequence.isEmpty();
  }

  public String toString() {
    return arraySequence.toString();
  }

  private ArraySequence arraySequence = new ArraySequence();
}