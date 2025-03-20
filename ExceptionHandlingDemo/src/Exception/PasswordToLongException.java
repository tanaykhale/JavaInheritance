package Exception;

@SuppressWarnings("serial")
public class PasswordToLongException extends Exception {
	public String toString() {
		return ("Password length cannot be more than 12 characters");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Password length cannot be more than 12 characters";
	}
	
}
