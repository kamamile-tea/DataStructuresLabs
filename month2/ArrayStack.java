class ArrayStack {
  void push(int val) {
    arraySequence.add(arraySequence.size(), val);
  }
  int pop() {
    return arraySequence.remove(arraySequence.size()-1);
  }
  boolean isEmpty() {
   return arraySequence.isEmpty();
  }

  public String toString() {
    return arraySequence.toString();
  }

  ArraySequence arraySequence = new ArraySequence();
}