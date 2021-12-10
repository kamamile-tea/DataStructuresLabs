import java.util.*;
import java.io.File;

class FindLast{
  public static void main(String[] args)throws Exception{
    try{
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    String choice = in.next();

    while(true){
      int runs = 1, lastOccur = -1;
      Scanner file = new Scanner(new File("numbers2.text"));

      while(file.hasNextLine()){
        String line = file.nextLine();

        if(line.equals(choice)){
        lastOccur = runs;
        }
        runs++;
      }

      if(lastOccur == -1){
        System.out.println(choice + " does not appear in the file");
      }
      else{
        System.out.println(choice + " last appears in the file at position " + lastOccur);
      }

      System.out.print("Enter a number: ");
      choice = in.next();
    }
  }
  catch(NoSuchElementException e){
    
  }
  }
  
}