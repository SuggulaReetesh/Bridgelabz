import java.util.*;

public class PrintThreeNames {
    private static Scanner in;
	private static String [] names = new String[3];

	public static void main(String arg[]) {

    	  in = new Scanner(System.in);
    	  for(int i=0;i<3;i++) {
    		  names[i]=in.next();
    	  }
    	  System.out.print("Hi");
    	  for(int i=names.length-1;i>=1;i--) {
    		  System.out.print(" "+names[i]+",");
    	  }
    	  System.out.print(" and "+ names[0]);
      }
}
