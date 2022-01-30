import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to search in array: ");
		int search=sc.nextInt();
		int i;
		int[] array= {5 ,12 ,14, 6 ,78 ,19, 1 ,23 ,26 ,35 ,37 ,7 ,52 ,86 ,47};
		for(i=0;i<array.length;i++) {
			if(array[i]==search) {
				System.out.print("found at index: "+i);
				break;
			}
			
		}
		if(i==array.length) {
			System.out.println("Does not Exist");
		}

	}

}
