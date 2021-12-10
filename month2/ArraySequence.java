class ArraySequence {

  int get(int pos) {
    return arrayArray.get(pos);
  }

  void set(int pos, int val) {
    arrayArray.set(pos, val);
  }

  void add(int at, int val) {
    for(int i = arrayArray.length()-1; i > at; i--){
      arrayArray.set(i, arrayArray.get(i-1));
    }
    arrayArray.set(at, val);
    size++;
  }

  int remove(int at) {
    int theVal = arrayArray.get(at);
    for(int i = at; i < arrayArray.length() - 1; i++){
      arrayArray.set(i, arrayArray.get(i+1));
    }
    size--;
    return theVal;
  }

  int capacity() {
    return arrayArray.length();
  }

  int size() {
    return size;
  }
  
  boolean isEmpty() {
    if(size == 0){
      return true;
    }
    return false;
  }

  public String toString() {
    String s = "{";
    for(int i = 0; i < size; i++){
      s += arrayArray.get(i);
      if(i < size-1){
        s += ", ";
      }
    }
    s += "}";
    return s;
  }

  ArrayArray arrayArray = new ArrayArray();
  int size = 0;
}

