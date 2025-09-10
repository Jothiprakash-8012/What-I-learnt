package catchtryfinallythrowandexceptions;
class InvalidMarkException extends Exception{
	InvalidMarkException(String message){
		super(message);
	}
}
public class CustomExceptionDemo {
	static void validateMark(int mark) throws InvalidMarkException{
		if(mark<0|| mark>100) {
			throw new InvalidMarkException("Mark must bebetween 0 and 100");
		}
		else {
			System.out.println("Void mark :"+mark);
		}
	}
	public static void main(String[] args) {
		try {
			validateMark(10);
			
		}
		catch(InvalidMarkException e){
			System.out.println("Exception :"+e.getMessage());
		}
	}

}
