import java.util.*;
public class Trig {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
                System.out.print("Enter degrees");
		double degrees;
		degrees=in.nextDouble();
        
		double radians = Math.toRadians(degrees); 
  
        System.out.println("sin"+Math.sin(radians)); 
        System.out.println("cos"+Math.cos(radians));
        in.close();
  
	}
}
