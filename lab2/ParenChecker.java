import java.util.*;

class ParenChecker {
	ParenChecker(String exp){
    this.exp = exp;
  }

  private static String openers = "([{<";
  private static String closers = ")]}>";

  public static boolean isOpener(String token){
    return openers.indexOf(token) > -1;
  }

  public static boolean isCloser(String token){
    return closers.indexOf(token) > -1;
  }

  public boolean match(String opener, String closer){
    return openers.indexOf(opener) == closers.indexOf(closer);
  }

	public void check() {
		Stack<String> stack = new Stack<String>();

		Scanner scanner = new Scanner(exp);

		while(scanner.hasNext()){
			String token = scanner.next();

			if(isOpener(token)){

				stack.push(token);
      }
			else if(isCloser(token)){
				if(stack.empty()){
          stack.push(token);
        }
        else if(match(stack.peek(), token)){
          stack.pop();
        }
        else{
          throw new ParenCheckerException("*** ERROR *** Mismatched '" + stack.peek() + "' and '" + token + "'");
        }
			}
		}

		if (!stack.isEmpty()){
      String singles = "";
      int count = 0;

      if(closers.contains(stack.peek())){
        singles += "'"+ openers.charAt(closers.indexOf(stack.peek())) +"'";

        if(!stack.empty()){
          singles += " ";
        }
      }
      while(!stack.isEmpty() && openers.contains(stack.peek())){
        if(count == 0){
          singles += "closers ";
        }

        count++;

        singles += "'"+ closers.charAt(openers.indexOf(stack.pop())) +"'";

        if(!stack.empty()){
          singles += " ";
        }
      }

      throw new ParenCheckerException("*** ERROR *** Missing " + singles);
    }
	}

	private String exp;

	public static void main(String [] args) {
		if (args.length != 1) {
			System.out.println("Usage: ParenChecker <expression>");
			System.exit(1);
		}

		String exp = args[0];

		try {
			new ParenChecker(exp).check();
			System.out.println("OK!");
		} catch (ParenCheckerException pce) {
      System.out.println(pce.getMessage());
		}
	}
}

public class ParenCheckerException extends RuntimeException {
	public ParenCheckerException() {this("");}
	public ParenCheckerException(String message) { super(message);}
}