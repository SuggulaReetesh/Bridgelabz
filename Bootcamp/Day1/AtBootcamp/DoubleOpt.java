import java.util.*;
public class DoubleOpt {
	
     public static void main(String args[]) {
    	 
    	 Scanner in= new Scanner(System.in);
    	 Double a,b,c;
         System.out.println("A value");
    	 a=in.nextDouble();
         System.out.println("B value");
    	 b=in.nextDouble();
         System.out.println("C value");
    	 c=in.nextDouble();
    	 System.out.println(a+b*c);
    	 System.out.println(a*b+c);
    	 System.out.println(c+a/b);
    	 System.out.println(a%b+c);
    	 in.close();
    	 
     }
}