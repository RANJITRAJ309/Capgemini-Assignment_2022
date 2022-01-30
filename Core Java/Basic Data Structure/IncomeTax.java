import java.util.Scanner;
public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your income: ");
		int ctc=sc.nextInt();
		if(ctc<=180000) {
			System.out.println("Tax amount: "+0);
		}
		else if(ctc>=181001 && ctc<=300000) {
			System.out.print("Tax amount: "+(int)(ctc*0.1));
		}
		else if(ctc>=300001 && ctc<=500000) {
			System.out.print("Tax amount: "+(int)(ctc*0.2));
		}
		else if(ctc>=500001 && ctc<=1000000) {
			System.out.print("Tax amount: "+(int)(ctc*0.3));
		}
		else {
			System.out.print("please Enter correct income");
		}
		}

}
