import java.util.Scanner;
public class String_Assignment {
	public static void main(String[] args ) {
//		// Q1
		String str="Hello World";
		System.out.println("Length of hello world: "+str.length());
//	    Length of hello world: 11      -output
		
	
//		// Q2
		String str1="Hello";
		String str2="How are you?";
		String joint=str1.concat(" "+str2);
		System.out.println(joint);
//		Hello How are you?     - output
		
		
		// Q3
		String sentence="Java String pool refers to collection of Strings which are stored in heap memory";
		// a)
		System.out.println(sentence.toLowerCase());
//		java string pool refers to collection of strings which are stored in heap memory     - output
//		
		// b)
		System.out.println(sentence.toUpperCase());
//        JAVA STRING POOL REFERS TO COLLECTION OF STRINGS WHICH ARE STORED IN HEAP MEMORY     - output
		
		// c)
		String s=sentence.replace('a', '$');
		System.out.println(s);
//		J$v$ String pool refers to collection of Strings which $re stored in he$p memory  - output
		
		// d)
		System.out.println(sentence.contains("collection"));
//		true  - output
		
		// e)
		String second="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(sentence.compareTo(second)==0);
//		false        - output
		
		// f)
		System.out.println(sentence.equals(second));
//		false       -output
	}

}
