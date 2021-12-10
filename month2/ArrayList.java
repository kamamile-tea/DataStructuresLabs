class ArrayList extends ArraySequence{
  ArraySequence arraySequence = new ArraySequence();

  int get(int pos) {
    return arraySequence.get(pos);
  }
  void set(int pos, int val) {
     arraySequence.set(pos, val);
  }
  void add(int pos, int val) {
    arraySequence.add(pos, val);
  }
  int remove(int pos) {
    return arraySequence.remove(pos);
  }
  public String toString() {
    return arraySequence.toString();
  }
  int size() {
    return arraySequence.size();
  }
  boolean isEmpty() {
    return arraySequence.isEmpty();
  }

  public static void main(String[] args){


  }
}