import java.util.Scanner;
class Divide{
	int a,b;
	public void getQuotient() throws UnsupportedOperationException {
		System.out.println("Quotient: "+a/b);
	}
}
public class ExceptionHandlingQ2 {

	public static void main(String[] args) throws UnsupportedOperationException {
		Scanner sc=new Scanner(System.in);
		Divide dv=new Divide();
		System.out.print("Enter Divident: ");
		dv.a=sc.nextInt();
		System.out.print("Enter Divisor: ");
		dv.b=sc.nextInt();
		try {
		dv.getQuotient();
		}
		catch(Exception e) {
			System.out.println("UnsupportedOperationException occured");
			System.out.println("Reason: "+e);
		}
	}

}
