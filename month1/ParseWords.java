import java.util.ArrayList;

class ParseWords{
  public static void main(String[] args){
    String[] my = getBigWords("London Paris Berlin");

    for(String m: my){
      System.out.println(m);
    }
  }

  static String[] getBigWords(String sentence){
    ArrayList<String> bigWords = new ArrayList<String>();

    int length = 0, spot = 0;
    for(int i = 0; i < sentence.length(); i++){
      spot = i;
      while(((sentence.charAt(i) > 64 && sentence.charAt(i) < 91) || (sentence.charAt(i) > 96 && sentence.charAt(i) < 123)) && (i < sentence.length())){
        length++;
        i++;

        if(i == sentence.length()){
          break;
        }
      }
      if(length > 5){
        bigWords.add(sentence.substring(spot, spot + length));
      }
      spot = spot + length;
      length = 0;
    }

    String[] finalBigWords = new String[bigWords.size()];


    return bigWords.toArray(finalBigWords);
    
  }
}