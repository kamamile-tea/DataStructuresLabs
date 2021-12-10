class Recursion{
  public static String reverse(String original){

	if(original.length() <= 1){
		return original;
	}

  String newStart = original.substring(original.length()-1);

  String newMiddle = original.substring(1, original.length() - 1);

  String newEnd = original.substring(0, 1);
	
  display(newStart, newMiddle, newEnd);

	return newStart + reverse(newMiddle) + newEnd;
}

public static void display(String newStart, String middle, String newEnd){
  System.out.println("The new start " + newStart + "\n");
  System.out.println("The new middle " + middle + "\n");
  System.out.println("The new end " + newEnd + "\n");
}

public static void main(String[] args){
  String theReverse = reverse("fork");

  System.out.println(theReverse);
}

}