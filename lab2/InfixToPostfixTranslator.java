import java.util.*;

public class InfixToPostfixTranslator{

	InfixToPostfixTranslator(String exp){
    this.exp = exp;
  }

	String xlate() {
		Stack<String> stack = new Stack<String>();;

		Scanner scanner = new Scanner(exp);

		String postfixExp = "";

		while (scanner.hasNext()) {
			String token = scanner.next();
      // If the input is an operand
			if (isOperand(token))
				postfixExp += token + " ";
			else if (token.equals("("))
				stack.push("(");
			else if (token.equals(")")) {
				String optr = stack.pop();
				while (!optr.equals("(")) {
					postfixExp += optr + " ";
					optr = stack.pop();
				}
			}
      else if(precLevel(token) == 3){
        stack.push(token);
      }
      //If its an operator
			else {
				while (!stack.empty()) {
					String optr = stack.peek();
					if(precLevel(optr) >= precLevel(token)){
						postfixExp += optr + " ";
            stack.pop();
          }
					else {
						break;
					}
				}
				  stack.push(token);
			}
		}

		while (!stack.isEmpty())
			postfixExp += stack.pop() + " ";

		return postfixExp.trim();
	}

	private boolean isOperand(String token){
    return Character.isDigit(token.charAt(0));
  }

	int precLevel(String optr){
		switch (optr) {
			case "+":
			case "-":
				return 1;

			case "*":
			case "/":
				return 2;
      case "^":
        return 3;
		}
		return -1;
	}		

	String exp;

	public static void main(String [] args) {
		if (args.length != 1) {
			System.out.println("Usage: InfixToPostTranslator <exp>>");
			System.exit(1);
		}

		System.out.println(new InfixToPostfixTranslator(args[0]).xlate());
	}
}


