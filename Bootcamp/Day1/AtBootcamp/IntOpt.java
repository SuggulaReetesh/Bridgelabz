import java.util.*;
public class IntOpt {
	
     public static void main(String args[]) {
    	 
    	 Scanner in= new Scanner(System.in);
    	 int a,b,c;
    	 System.out.println("A value");
    	 a=in.nextInt();
         System.out.println("B value");
    	 b=in.nextInt();
         System.out.println("C value");
    	 c=in.nextInt();
    	 System.out.println(a+b*c);
    	 System.out.println(a*b+c);
    	 System.out.println(c+a/b);
    	 System.out.println(a%b+c);
    	 in.close();
    	 
     }
}
