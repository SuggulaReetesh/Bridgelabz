

import java.util.*;
public class MathFunction {
	public static double presentValue(double c, double r,double t) {
		double value=c/Math.pow(1+r, t);
		return value;
		
	}
	
	public static int minval(int[] a) {
		int min=a[0]; 
			for(int i=0;i<a.length;i++) {
				min=Math.min(min, a[i]);
				
			}
		return min;
	}
	
	public static int maxval(int[] a) {
	       int max=a[0];
			for(int i=0;i<a.length;i++) {
				max=Math.max(max, a[i]);
				
			}
		return max;
	}
	
	public static String minval(String[] a) {
		int min=Integer.parseInt(a[0]); 
		for(int i=0;i<a.length;i++) {
			min=Math.min(min, Integer.parseInt(a[i]));
			
		}
		return Integer.toString(min);
	}
	public static String maxval1(String[] a) {
		int max=Integer.parseInt(a[0]); 
		for(int i=0;i<a.length;i++) {
			max=Math.max(max, Integer.parseInt(a[i]));
			
		}
		return Integer.toString(max);
	}
	
	public static String collinear(int x1,int x2,int x3,int y1,int y2,int y3) {
		int ab = y2-y1/x2-x1;
		int bc = y3-y2/x3-x2;
		int ac= y3-y1/x3-x1;
		if(ab==ac && bc==ac && bc==ac) {
			return "collinear";
		}
		else {
			return "Not collinear";
		}
	}
	 
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("1. present value of compund interest");
		System.out.println("2. min of array");
		System.out.println("3. max of array");
		System.out.println("4. min of string array");
		System.out.println("5. max of String array");
		System.out.println("6. check for collinear");
		int n=in.nextInt();
		
		switch(n) {
		case 1:double c=in.nextDouble();
	    	   double r=in.nextDouble();
	    	   double t=in.nextDouble();
	    	   System.out.println(presentValue(c,r,t));
	    	   break;
		case 2:System.out.println("Enter size of array");
			  int num=in.nextInt();
		       int a[]=new int[num];
		       for(int i=0;i<num;i++) {
		    	   a[i]=in.nextInt();
		       }
		       System.out.println(minval(a));
		       break;
		       
		case 3:System.out.println("Enter size of array");
			    int num1=in.nextInt();
	       		int a1[]=new int[num1];
	       		for(int i=0;i<num1;i++) {
			    	   a1[i]=in.nextInt();
			       }
	       		System.out.println(maxval(a1));
	       		break;
	       		
		case 4:System.out.println("Enter size of array");
			   int num3=in.nextInt();
	           String a3[]=new String[num3];
	           for(int i=0;i<num3;i++) {
		    	   a3[i]=in.next();
		       }
	           System.out.println(minval(a3));
	           break;
		 case 5:System.out.println("Enter size of array");
			 int num4=in.nextInt();
	       		int a4[]=new int[num4];
	       		for(int i=0;i<num4;i++) {
			    	   a4[i]=in.nextInt();
			       }
	       		System.out.println(maxval(a4));
	       		break;  
		 case 6:System.out.println("x1 value");
			 	int x1=in.nextInt();
			 	System.out.println("x2 value");
		        int x2=in.nextInt();
		        System.out.println("x3 value");
		        int x3=in.nextInt();
		        System.out.println("y1 value");
		        int y1=in.nextInt();
		        System.out.println("y2 value");
		        int y2=in.nextInt();
		        System.out.println("y3 value");
		        int y3=in.nextInt();
		        System.out.println(collinear(x1,x2,x3,y1,y2,y3));
		        break;
		default:System.out.println("enter correct choice");
		
		}
		in.close();
	
	}

}
