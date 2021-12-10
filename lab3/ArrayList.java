package lab3;

public class ArrayList<E> implements List<E>{
  E[] myArray;
  int size = 0;
  int capacity = 5;

  public ArrayList(){
    myArray = (E[]) new Object[capacity];
  }

  @Override
  public E get(int pos){
    if(pos >= size){
      System.out.print("fat oops");
      return myArray[0];
    }
    E elem = myArray[pos];
    return elem;
  }

  @Override
  public void set(int pos, E value){
    if(pos >= size){
      //throw new CollectionException("list", "set " + pos, "pos DNE");
      System.out.println("fat oops");
    }
    myArray[pos] = value;
  }

  @Override
  public void add(int pos, E value){
    size++;

    //resize capacity if size exceeds capacity
    if(size >= capacity){
      capacity *= 2;
      E[] newArray = (E[]) new Object[capacity];

      for(int i = 0; i < size-1; i++){
        newArray[i] = myArray[i];
      }

      myArray = newArray;
    }

    if(pos == size - 1){
      myArray[pos] = value;
      return;
    }

    if(pos > size-1){
      size--;
      System.out.println("error");
      return;
    }
    
    for(int i = size - 1; i > pos; i--){
      myArray[i] = myArray[i-1];
    }

    myArray[pos] = value;
  }

  @Override
  public E remove(int pos){
    if (pos > size - 1){
      System.out.println("ahhh");
      E thing = myArray[pos];
      return thing;
    }

    if(pos == size - 1){
      size--;
      return myArray[pos];
    }

    E grabbed = myArray[pos];

    for(int i = pos; i < size - 1; i++){
      myArray[i] = myArray[i+1];
    }

    size--;

    return grabbed;
  }

  @Override
  public int size(){
    return size;
  }

  @Override
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }

    return false;
  }

  @Override
  public int capacity(){
    return capacity;
  }

  @Override
  public String toString(){
    String representation = "";
    representation += "{";
    for(int i = 0; i < size; i++){
      representation += myArray[i];

      if(i != size - 1){
        representation += ", ";
      }
    }
    representation += "}";

    return representation;
  }

  // public static void main(String[] args){
  //   System.out.println("Oops");

  //   ArrayList<Integer> myList = new ArrayList<>();

  //   String arr = myList.toString();

  //   System.out.println(arr);

  //   myList.add(0,0);
  //   quickPrint(myList);

  //   myList.add(1,1);
  //   quickPrint(myList);

  //   myList.add(0,2);
  //   quickPrint(myList);

  //   myList.add(3,3);
  //   quickPrint(myList);

  //   myList.add(0,4);
  //   quickPrint(myList);

  //   System.out.println(myList.size());

  //   System.out.println(myList.capacity());







  // }

  // public void test1(ArrayList<String> myList){
  //       myList.add(0,"woop");

  //   String arr2 = myList.toString();

  //   System.out.println(arr2);

  //   myList.add(5,"yip");

  //   String arr3 = myList.toString();

  //   System.out.println(arr3);

  //   myList.remove(3);

  //   String arr4 = myList.toString();

  //   System.out.println(arr4);

  //   myList.add(1, "second");
  //   myList.add(2, "third");
  //   myList.add(3, "fourth");
  //   myList.add(4, "fifth");
  //   myList.add(5, "sixth");

  //   String arr5 = myList.toString();

  //   System.out.println(arr5);

  //   myList.remove(3);

  //   String arr6 = myList.toString();

  //   System.out.println(arr6);

  //   myList.remove(9);

  //   String arr7 = myList.toString();

  //   System.out.println(arr7);

  //   System.out.println(myList.size());

  //   System.out.println(myList.capacity());

  //   myList.set(3, "munhckin");

  //   String arr8 = myList.toString();

  //   System.out.println(arr8);

  //   System.out.println(myList.get(9));
  //   System.out.println(myList.get(3));
  //   System.out.println(myList.isEmpty());
  // }

  // public static void quickPrint(ArrayList<Integer> myList){
  //   String arr = myList.toString();

  //   System.out.println(arr);
  // }

}

