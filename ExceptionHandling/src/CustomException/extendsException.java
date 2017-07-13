////when u want to make custom checked Exception then extend  Exception.

package CustomException;

public class extendsException extends Exception {
	
	String a;

	public extendsException() {

	}

	public extendsException(String a) {
		super();
		this.a = a;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return a;
	}

}
