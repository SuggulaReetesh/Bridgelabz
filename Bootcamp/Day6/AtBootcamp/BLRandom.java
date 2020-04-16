
import com.bridgelabz.lib.*;
import java.util.Random;
import java.util.Scanner;

public class BLRandom {
	 
	 
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter no of times");
		 int n = in.nextInt();
		 System.out.println("enter seed value");
		 String seed =in.next();
		 
	        if (args.length == 2) 
	        	StdRandom.setSeed(Long.parseLong(seed));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
	        double[] a = {0.5, 0.3, 0.1, 0.1};

	        System.out.println("seed = " + StdRandom.getSeed());
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%2d ",StdRandom.uniform(100));
	            System.out.printf("%8.5f ", StdRandom.uniform(10.0, 99.0));
	            System.out.printf("%5b ",   StdRandom.bernoulli(0.5));
	            System.out.printf("%7.5f ", StdRandom.gaussian(9.0, 0.2));
	            System.out.printf("%1d ",   StdRandom.discrete(probabilities));
	  
	            StdRandom.shuffle(a);
	            for (double s : a)
	                System.out.print(s);
	            System.out.println();
	        }
		
	}

}
