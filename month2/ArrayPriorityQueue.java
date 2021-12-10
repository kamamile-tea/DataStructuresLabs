class ArrayPriorityQueue {
  public void add(int val) {
    arraySequence.add(arraySequence.size(), val);
  }
  
  public int remove() {
    int largest = arraySequence.get(0);
    int largestPos = 0;
    for(int i = 1; i < arraySequence.size(); i++){
      if(largest < arraySequence.get(i)){
        largest = arraySequence.get(i);
        largestPos = i;
      }
    }
    return arraySequence.remove(largestPos);
}

  public boolean isEmpty() {
    return arraySequence.isEmpty();
  }

  public String toString() {
    return arraySequence.toString();
  }

  private ArraySequence arraySequence = new ArraySequence();
}