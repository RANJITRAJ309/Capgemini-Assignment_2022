import java.util.Scanner;

class Pair{
	private String key;
	private String value;

	public Pair(String key,String value) {
		this.key=key;
		this.value=value;
	}
	public String getKey(){
		return key;
	}
	public String getValue() {
		return value;
	}
	public void setKey() {
		System.out.println("Key: "+key+" ");
	}
	public void setValue(){
		System.out.println("Value: "+value);
	}
	
	


}
public class GenericsQ4a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr String Key: ");
		String a=sc.nextLine();
		System.out.print("Enter String value: ");
		String b=sc.nextLine();
		Pair obj=new Pair(a,b);
		obj.setKey();
		obj.setValue();

	}

}
