import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Principle amount: ");
        int p=s.nextInt();
        System.out.print("Enter your rate of interest: ");
        double r= s.nextDouble();
        System.out.print("Enter your time for interest: ");
        int t=s.nextInt();

        double SI=p*t*r*0.01;
        double CI=p*Math.pow(1+r*0.01,t)-p;

        System.out.println("Simple Interest: "+(int)SI);
        System.out.println("Compound Interest: "+(int)CI);

    }
}

