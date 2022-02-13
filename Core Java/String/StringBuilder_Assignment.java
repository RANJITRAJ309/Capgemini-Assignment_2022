
public class StringBuilder_Assignment {

	public static void main(String[] args) {
		// Q1)
		StringBuilder sb=new StringBuilder("");
		sb.append("StringBuilder");
		sb.append(" is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings.");
		System.out.println(sb);
//		StringBuilder is a peer class of String that provides much of the functionality of strings. - output
		

		
		// Q2)
		StringBuilder sb1=new StringBuilder("It is used to  at the specified index position");
		System.out.println(sb1.insert(14, "insert text"));
//		It is used to insert text at the specified index position   - output
		
		
		// Q3)
		StringBuilder sb2=new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(sb2.reverse());
//		dellac saw ti hcihw no tcejbo desrever eht snruter dohtem sihT     - output
		

	}

}
