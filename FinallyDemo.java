package catchtryfinallythrowandexceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans= {1,2,3};
		try {
			System.out.println("Accessing elements :"+ans[5]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception :"+e.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
