import java.util.HashMap;
import java.util.Random;
public class GenericsQ2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> map=new HashMap<>();
		Random r=new Random();
		int max=45;
		double range=6.92;
		double min=4;
		for(int i=0;i<10;i++) {
			int a=(int)(r.nextInt(max));
			double d=range+r.nextDouble();
			map.put(a, d);
			}
		System.out.println(map);

	}

}
