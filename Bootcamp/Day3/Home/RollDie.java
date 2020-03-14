import java.util.*;
public class RollDie {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		Random rand=new Random();
		int n=in.nextInt();
		int dice[]=new int[7];
		for(int i=0;i<n;i++) {
			dice[rand.nextInt(6)+1]++;
		}
		System.out.println("no of times dice occured");
		for(int i=1;i<=6;i++) {
			System.out.print(dice[i]+" ");
		}
		
		int max=dice[1];;
		for(int i=1;i<=6;i++) {
			max=Math.max(max, dice[i]);
			
		}
		System.out.println();
		System.out.println("dice with maximum number of times");
		for(int i=1;i<=6;i++) {
			if(dice[i]==max)
				System.out.println(i);
			
		}
		in.close();
		
		
	}
}
