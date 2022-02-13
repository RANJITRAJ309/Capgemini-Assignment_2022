import java.util.*;
public class StringBuffer_Assignment {
	public static void main(String[] args) {
		// Q1)
		StringBuffer sb=new StringBuffer("");
		sb.append("StringBuffer");
		sb.append(" is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings.");
		System.out.println(sb);
//		StringBuffer is a peer class of String that provides much of the functionality of strings.      - output
		
		
		// Q2)
		StringBuffer sb1=new StringBuffer("It is used to  at the specified index position");
		sb.insert(14,"insert text");
		System.out.println(sb1);
//		It is used to insert text at the specified index position     - output
		
		
		// Q3)
		StringBuffer sb2=new StringBuffer("This method returns the reversed object on which it was called");
		sb.reverse();
		System.out.println(sb2);
//		dellac saw ti hcihw no tcejbo desrever eht snruter dohtem sihT       - output
		
		


	}

}
