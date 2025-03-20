package Exception;

@SuppressWarnings("serial")
public class PasswordValid extends Exception {

	public String toString() {
		return "Enter the password which have one uppercase,one lowercase,one number and one special character";
	}
}
