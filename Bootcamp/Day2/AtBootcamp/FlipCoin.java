import java.util.*;
public class FlipCoin {
	public static void main(String args[]) {
		int tailscount=0;
		int headscount=0;
		Scanner in =new Scanner(System.in);
		int noofflips;
                System.out.println("No of chances");
		noofflips=in.nextInt();
		int n=noofflips;
		while(noofflips>0) {
			if (Math.random() < 0.5){
				headscount++;
			}
			else{
				tailscount++;
			}
			noofflips--;
		}
		System.out.println("Tails percenatge"+ ((double)tailscount/(double)n)*100);
		System.out.println("Heads percenatge"+ ((double)headscount/(double)n)*100);
		in.close();
		
	}

}
