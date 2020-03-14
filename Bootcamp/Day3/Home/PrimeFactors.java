import java.util.*;
public class PrimeFactors {
	public static void primeFactors(int n) 
    { 
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
        
        while(n%3==0) {
        	System.out.print(3 + " "); 
            n /= 3;
        }
        
        for (int i = 5; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 

        if (n > 2) 
            System.out.print(n); 
    } 
  
    public static void main (String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter a number");
        int n = in.nextInt(); 
        primeFactors(n); 
        in.close();
    } 
}
