class ReverseArr{
  public static void main(String[] args){
    int k, temp;
    int[] a = {1,2,3,4,5};
    
    for(k=0;k < a.length/2; k++){
      temp = a[k];
      a[k] = a[a.length - (k+1)];
      a[a.length - (k+1)] = temp;
    }

    for(k = 0; k < a.length; k++){
      System.out.println(a[k]);
    }
  }
}