class Counter{
  private int counter;
  private int limit;
  private static int nCounters = 0;

  public Counter(int first, int sec){
    counter = first;
    limit = sec;
    nCounters++;
  }

  public void increment(){
    if(counter < limit){
      counter++;
    }
  }

  public void decrement(){
    if(counter > 0){
      counter--;
    }
  }

  public int getValue(){
    return counter;
  }

  public static int getNCounters(){
    return nCounters;
  }
}