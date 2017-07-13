
//when u want to make custom unchecked Exception then extend Runtime Exception.

package CustomException;


public class CreateCustomException extends RuntimeException {
	String a;

	public CreateCustomException() {

	}

	public CreateCustomException(String a) {
		super();
		this.a = a;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return a;
	}

}
