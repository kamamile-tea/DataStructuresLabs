class ArrayAssociative {
	public void add(int value) {
    arraySequence.add(0,value);
  }
	public void remove(int value) {
    for(int i = 0; i < arraySequence.size(); i++){
      if(arraySequence.get(i) == value){
        arraySequence.remove(i);
      }
    }
  }

	public boolean contains(int value) {
    for(int i = 0; i < arraySequence.size(); i++){
      if(arraySequence.get(i) == value){
        return true;
      }
    }
    return false;
  }

	public int size() {
    return arraySequence.size();
  }
	public boolean isEmpty() {
    return arraySequence.isEmpty();
  }

	public String toString() {
    return arraySequence.toString();
  }

	private int find(int value) {
    for(int i = 0; i < arraySequence.size(); i++){
      if(arraySequence.get(i) == value){
        return i;
      }
    }
    return -1;
  }

	ArraySequence arraySequence = new ArraySequence();;
}