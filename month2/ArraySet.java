class ArraySet{

	public void add(int value) {
    if(arrayAssociative.contains(value)){
      return;
    }
    else{
      arrayAssociative.add(value);
      return;
    }
  }

	public void remove(int value) {
    if(arrayAssociative.contains(value)){
      arrayAssociative.remove(value);
      return;
    }
    else{
      return;
    }
  }

  public boolean isEmpty(){
    return arrayAssociative.isEmpty();
    
  }

  public int size(){
    return arrayAssociative.size();
  }

  public boolean contains(int value){
    return arrayAssociative.contains(value);
  }

  public String toString(){
    return arrayAssociative.toString();
  }

  ArrayAssociative arrayAssociative  = new ArrayAssociative();
}