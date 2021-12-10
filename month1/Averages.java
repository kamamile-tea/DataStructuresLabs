import java.util.*;
import java.io.File;
class Averages{
  public static void main(String[] args)throws Exception{
    Scanner in = new Scanner(new File("numbers.text"));
    int runs = 0;

    while(in.hasNextLine() && in.hasNext()){
      int total = 0, i = 0, theNum;
      int amount = in.nextInt();
      int[] nums = new int[amount];

      while(i < amount){
        theNum = in.nextInt();
        total += theNum;
        nums[i] = theNum;
        i++;
      }

      System.out.print("The average of the " + amount + " integers ");

      for(int n: nums){
        System.out.print(n + " ");
      }

      System.out.print("is " + ((total*(1.0))/amount) + "\n");

      runs++;
    }

    System.out.println(runs + " sets of numbers processed");
  }
}