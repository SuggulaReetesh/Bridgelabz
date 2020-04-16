

import java.util.*;
public class MathFunctions {
	 public static double HarmonicNumber() {
			Scanner in =new Scanner(System.in);
			int n;
			double result=0;
			System.out.println("Enter a number to generate harmonic");
			n=in.nextInt();
			for(int i=1;i<n;i++) {
				System.out.print(1+"/"+i+"+");
				result=result+1/(double)i;
			}
			result=result+1/(double)n;
                        System.out.println(1+"/"+n+" =");
			
			in.close();
return result;
		}
	 public static double sqrt(double c) {
		 
	        double epsilon = 1.0e-15;  
	        double t = c;             

	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
		 
		return t;
		 
	 }
	 public static double sqrt(double c,double epsilon) {
		   
	        double t = c;             
	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
		 
		return t;
		 
	 }
	 
	 public static int isPrime(int n) {
		    
		    int i;
		 	if(n<=1)
		    	return 0;
		    if(n==2 || n==3)
		    	return 1;
		    if(n%2==0 || n%3==0)
		    	return 0;
		    for(i=5;i<=Math.sqrt(n);i+=2)
		    {
		        if(n%i==0)
		        	return 0;
		    }
		    return 1;
			
	 }
	 
	 public static long factorial(int n) {
		 long value=1;
		 for(int i=1;i<=n;i++) {
			 value=value*i;
		 }
		return value;
	}
	 
	public static double futureValue(double c, double r,double t) {
		double value=c*Math.pow(1+r, t);
		return value;
		
	}
	 
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.println("1.Harmonic number");
		System.out.println("2.sqrt with c parameter");
		System.out.println("3.sqrt with c and epsilon pparameter");
		System.out.println("4. check for prime");
		System.out.println("5. factorial");
		System.out.println("6. compund interest future value");
		int n=in.nextInt();
		switch(n) {
		case 1:System.out.println(HarmonicNumber());
		break;
		case 2:double p=in.nextDouble();
		       double result=sqrt(p);
		       System.out.println(result);
		       break;
		case 3:double p1=in.nextDouble();
		       double epsilon=in.nextDouble();
	           double result1=sqrt(p1,epsilon);
	           System.out.println(result1);
	           break;
		case 4:int n1=in.nextInt();
		       int check=isPrime(n1);
		       if(check==0) {
		    	   System.out.println(false);
		       }
		       else{
		        System.out.println(true);
		       }
		       break;
		case 5:int num=in.nextInt();
		       System.out.println(factorial(num));
		       break;
		case 6:double c=in.nextDouble();
		       double r=in.nextDouble();
		       double t=in.nextDouble();
		       System.out.println(futureValue(c,r,t));
		       break;
		default : System.out.println("Enter correct choice");
		in.close();
		       
		        
		}
		
	}
	

}
