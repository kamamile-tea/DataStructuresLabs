import java.util.*;
import java.io.File;

class File2String {
  public static void main(String[] args)throws Exception{
    System.out.println(f2s("f2sFile.txt"));
  }
  
  public static String f2s(String filename){
    try{
    String stringCopy = "";
    Scanner scanner  = new Scanner(new File(filename));

    while(scanner.hasNext()){
      String line = scanner.nextLine();
      stringCopy += line + "\n";
    }

    return stringCopy;
    }
    catch(Exception e){
      
    }
    return "";
  }
}