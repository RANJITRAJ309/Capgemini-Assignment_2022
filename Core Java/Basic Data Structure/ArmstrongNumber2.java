public class ArmstrongNumber2 {

	public static void main(String[] args) {
				for(int n=100; n<1000;n++) {
					int temp=n;
					int sum=0;
					while(temp>0) {
						int rem=temp%10;
						sum=sum+rem*rem*rem;
						temp=temp/10;
				}
					if(n==sum) {
						System.out.println(n);
					}
				}
		}


}
