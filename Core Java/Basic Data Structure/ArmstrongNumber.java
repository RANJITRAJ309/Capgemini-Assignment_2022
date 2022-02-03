import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enetr a number: ");
				int n=sc.nextInt();
				int temp=n;
				int rem;
				int sum=0;
				while(temp>0) {
					rem=temp%10;
					sum=sum+rem*rem*rem;
					temp=temp/10;
				}
				if(n==sum) {
					System.out.println(n+" is armstrong number");
				}
				else {
					System.out.println(n + " is not armstrong number");

		}


	}

}
