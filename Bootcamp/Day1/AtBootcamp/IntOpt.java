import java.util.*;
public class IntOpt {
	
     public static void main(String args[]) {
    	 
    	 Scanner in= new Scanner(System.in);
    	 int a,b,c;
    	 a=in.nextInt();
    	 b=in.nextInt();
    	 c=in.nextInt();
    	 System.out.println(a+b*c);
    	 System.out.println(a*b+c);
    	 System.out.println(c+a/b);
    	 System.out.println(a%b+c);
    	 in.close();
    	 
     }
}
