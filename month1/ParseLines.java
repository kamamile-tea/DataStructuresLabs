class ParseLines{
  public static void main(String[] args){
    String my = getSecondLine("i am an\nEgg\nGru");
    System.out.println(my);
  }

  static String getSecondLine(String paragraph){
    return paragraph.substring(paragraph.indexOf("\n")+1, paragraph.indexOf("\n", paragraph.indexOf("\n")+1));
  }
}