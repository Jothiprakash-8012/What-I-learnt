package catchtryfinallythrowandexceptions;
import java.util.Scanner;
public class ThrowDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ENter your age :");int age=scan.nextInt();
		try {
			if(age<0) {
				 throw new IllegalArgumentException("Age cannnon be negative");
			}
			else {
				System.out.println("Valid age entered :"+age);
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception :"+e.getMessage());
		}
	}


}
