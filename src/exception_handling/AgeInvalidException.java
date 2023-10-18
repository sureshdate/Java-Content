package exception_handling;
//this custome Exception
public class AgeInvalidException extends Exception {

	AgeInvalidException()
	{
		super("Age is invalid");
	}
	AgeInvalidException(String Message){
		super(Message);
	}
}
