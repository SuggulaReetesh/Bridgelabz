import java.util.*;
public class Stats5 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter number");
		n=in.nextInt();
		double [] a=new double[n];
		double min;
		double max;
		double average,sum = 0;
		
	
		for(int i =0; i<n; i++){
		      double randomInt = Math.random();
		      a[i]=randomInt;
		      sum=sum+a[i];
		      System.out.println(a[i]);
		      
		}
		average=sum/(double)n;
        min=a[0]; 
        max=a[0];;
		for(int i=0;i<n;i++) {
			min=Math.min(min, a[i]);
			max=Math.max(max, a[i]);
			
		}

        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
        in.close();
	}

}
