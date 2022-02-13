import java.util.Date;
import java.util.Scanner;

class pair<T,V>{
	private T key;
	private V value;

	public pair(T key,V value) {
		this.key=key;
		this.value=value;
		
	}
	public void setKey() {
		System.out.print(key);
	}
	public void setValue() {
		System.out.println(" "+ value);
	}
}
public class GenericsQ4_b {

	public static void main(String[] args) {
		Date date=new Date();
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Key Text: ");
//		String a=sc.nextLine();
		pair<String , java.util.Date> pair=new pair("Today is", date);
		pair.setKey();
		pair.setValue();

	}

}
