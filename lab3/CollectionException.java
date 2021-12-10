package lab3;

@SuppressWarnings("serial")
public class CollectionException extends RuntimeException {
	public CollectionException(String container, String operation, String message) {
		super("Collection Exception occurred in '" + container + "' when attempting to '" + operation + "'");
	}

  public static void main(String[] args){
    
  }
}
