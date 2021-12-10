import java.util.*;
import java.lang.Double;

class PostfixEvaluator {

	PostfixEvaluator(String exp){
    this.exp = exp;
  }

	double eval(){
		Stack<Double> stack = new Stack<Double>();

		Scanner scanner = new Scanner(exp);

    if(!scanner.hasNext()){
      throw new ParenCheckerException("*** ERROR *** Empty expression");
    }

		while (scanner.hasNext()) {
			String token = scanner.next();

			if (isOperand(token))
				stack.push(Double.parseDouble(token));
			else{	
        if(stack.empty()){
          throw new ParenCheckerException("*** ERROR *** Missing both operands");
        }

				double operand2 = stack.pop();

        if(stack.empty()){
          throw new ParenCheckerException("*** ERROR *** Missing left operand");
        }

				double operand1 = stack.pop();
				stack.push(eval(token, operand1, operand2));
			}
		}

    double hold = stack.pop();

    if(!stack.empty()){
      throw new ParenCheckerException("*** ERROR *** Extra operands in expression");
    }

		return hold;
	}

	private double eval(String optr, double operand1, double operand2) {
		switch (optr) {
			case "+": return operand1 + operand2;
			case "-": return operand1 - operand2;
			case "*": return operand1 * operand2;
			case "/": return operand1 / operand2;
      case "^": return Math.pow(operand1, operand2);
		}
		return -1;
	}

	private boolean isOperand(String token){
    return Character.isDigit(token.charAt(0));
  }

	String exp;

	public static void main(String [] args) {
		if (args.length != 1) {
			System.out.println("Usage: PostfixEvaluator <expression>");
			System.exit(1);
		}

    try{
		  System.out.println(new PostfixEvaluator(args[0]).eval());
    }
    catch(ParenCheckerException ecp){
      System.out.println(ecp.getMessage());
    }
	}
}

public class ParenCheckerException extends RuntimeException {
	public ParenCheckerException() {this("");}
	public ParenCheckerException(String message) { super(message);}
}
