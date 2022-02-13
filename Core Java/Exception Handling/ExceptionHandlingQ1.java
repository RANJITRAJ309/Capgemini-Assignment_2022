import java.util.Scanner;
class Div{
	int a;
	int b;
	public void divide() {
		try {
		System.out.println("Quentient : "+a/b);
	}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occured!");
			System.out.println("Reason: "+e);

		}
		catch(Exception e) {
			System.out.println("Some other exception occured");
			System.out.println(e);
		}
		System.out.println("Thanks for using this application.");

		}
}
public class ExceptionHandlingQ1 {

	public static void main(String[] args) {
		/**
		 *  Q1) Handling exception divide by zero.
		 */
		
		Scanner s=new Scanner(System.in);
		Div d=new Div();
		System.out.print("Enter divident: ");
		d.a=s.nextInt();
		System.out.print("Enter divisor: ");
		d.b=s.nextInt();
		d.divide();
		
//		Enter divident: 1000
//		Enter divisor: 0
//		Cannot divide by this number.                                     - output
//		Reason : java.lang.ArithmeticException: / by zero
//		Thanks for using this application
		

	}

}
