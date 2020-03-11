import java.util.*;
public class DoubleOpt {
	
     public static void main(String args[]) {
    	 
    	 Scanner in= new Scanner(System.in);
    	 Double a,b,c;
    	 a=in.nextDouble();
    	 b=in.nextDouble();
    	 c=in.nextDouble();
    	 System.out.println(a+b*c);
    	 System.out.println(a*b+c);
    	 System.out.println(c+a/b);
    	 System.out.println(a%b+c);
    	 in.close();
    	 
     }
}