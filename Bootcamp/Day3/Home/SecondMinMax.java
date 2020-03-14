

import java.util.*;
public class SecondMinMax {
	void second_max(int a[] ) {

		int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
		int i;
       
		    for (i = 0; i < a.length; ++i) {
		        if (first < a[i]) {
		            second = first;
		            first = a[i];
		        } else
		        if (a[i] > second && a[i] != first) {
		            second = a[i];
		        }
		    }

		    if (second == Integer.MIN_VALUE || a.length<2)
		        System.out.println("There is no second largest element\n");
		    else
		        System.out.println("The Second largest element in the array is: " + second);

		
	}
	
	void second_min(int a[]) {
		
		int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
		int i;
		    for (i = 1; i < a.length; ++i) {
		        if (a[i]<first) {
		            second = first;
		            first = a[i];
		        } 
		        else if (a[i] < second && a[i] != first) {
		            second = a[i];
		        }
		    }

		    if (second == Integer.MAX_VALUE || a.length<2)
		        System.out.println("There is no second minimum element\n");
		    else
		        System.out.println("The Second minimum element in the array is: " + second);
		   

	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		int i;
        System.out.println("Input elements in the array :");
		    for ( i = 0; i < n; i++) {
		    	a[i]=in.nextInt();
		    }
		SecondMinMax s=new SecondMinMax();
		s.second_max(a);
		s.second_min(a);
		in.close();
		
		  
		
	}
	

}
