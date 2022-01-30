import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=3;
		int count=0;
		while(i>0) {
			int marks=sc.nextInt();
			if(marks>60) {
				count++;
			}
			i--;
		}
		if(count==3) {
			System.out.println("Passed!");
		}
		else if(count==2) {
			System.out.println("promoted!");
		}
		else {
			System.out.println("failed!");
		}

	}

}
