import java.util.*;
public class GamlingSimulator {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("stake");
	        int stake  = in.nextInt();
	        System.out.println("goal");
	        int goal   = in.nextInt(); 
	        System.out.println("trials");
	        int trials = in.nextInt();  

	        int bets = 0;        
	        int wins = 0;        

	      
	        for (int t = 0; t < trials; t++) {

	        	int money = stake;
	            while (money > 0 && money < goal) {
	                bets++;
	                if (Math.random() < 0.5) 
	                	money++;  
	                else                     
	                	money--;     
	            }
	            if (money == goal) wins++;          
	        }

	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of wins : " + 100.0 * wins / trials);
	        System.out.println("Avg bets : " + 1.0 * bets / trials);
	        in.close();
	    }
		
	}
