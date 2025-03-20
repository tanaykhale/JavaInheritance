package Exception;

@SuppressWarnings("serial")
public class InvalidCountryException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Country name should be India";
	}

}
