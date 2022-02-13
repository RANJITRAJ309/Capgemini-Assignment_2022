import java.util.Scanner;
class Swap{
	public <T> void swap_element(int arr[],int i,int j) {
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public void display(int array[]) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
public class GenericsQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {10,13,11,5,6,9,50};
		Swap s=new Swap();
		s.display(arr);
		System.out.println();
		System.out.print("Enter array index to swap:");
		int a=sc.nextInt();
		System.out.print("Enter array index to swap with:");
		int b=sc.nextInt();
		s.swap_element(arr, a, b);
		s.display(arr);

	}

}
