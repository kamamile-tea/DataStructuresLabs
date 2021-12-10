import java.io.*;
import java.util.Scanner;

class MergetwoFiles{
  public static void main(String[] args)throws Exception{
    String file1 = "Kamille", file2 = "Tipan";
    Scanner myFile1 = new Scanner(new File(file1));
    Scanner myFile2 = new Scanner(new File(file2));
    boolean pass1, pass2;

    PrintWriter myFile = new PrintWriter(file1 + "-" + file2 + ".txt");

    while(myFile1.hasNextLine() && myFile2.hasNextLine()){
      if(myFile1.hasNextLine()){
        myFile.println(myFile1.nextLine());
      }
      if(myFile2.hasNextLine()){
      myFile.write(myFile2.nextLine()+"\n");
      }

    }
      PrintWriter go = new PrintWriter("leftovers.txt");


    while(myFile1.hasNextLine()){
      
      go.write(myFile1.nextLine());
    }
    while(myFile2.hasNextLine()){
      go.write(myFile2.nextLine());
    }

    go.flush();
    go.close();
    myFile.flush();
    myFile.close();
    myFile1.close();
    myFile2.close();

    

    
  }
  
}