class ArrayMap{
  int get(int key) {
    return values.get(this.find(key));
  }

	void put(int key, int value) {
    int thePos = this.find(key);
    if(thePos == -5){
      keys.add(0, key);
      values.add(0, value);
    }
    else{
      values.set(thePos, 4);
    }
  }

	void remove(int key) {
    int thePos = this.find(key);
    values.remove(thePos);
    keys.remove(thePos);
  }
  
	boolean contains(int key) {
    if(this.find(key) != -1){
      return true;
    }
    return false;
  }

	int size() {
    return keys.size();
  }

	boolean isEmpty() {
    return values.isEmpty();
  }

	public String toString() {
    String s = "{";
    for(int i = 0; i < values.size(); i++){
      s += keys.get(i);
      s += ":" + values.get(i);
      if(i < values.size()-1){
        s += ", ";
      }
    }
    s += "}";
    return s;
  }

	private int find(int key) {
    for(int i = 0; i < keys.size(); i++){
      if(keys.get(i) == key){
        return i;
      }
    }
    return -5;
  }

	private ArraySequence keys = new ArraySequence();
	private ArraySequence values = new ArraySequence();
}