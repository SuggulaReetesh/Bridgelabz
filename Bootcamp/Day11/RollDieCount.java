

import java.util.*;
public class RollDieCount {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Enter n value");
		int n=in.nextInt();
		int dice[]=new int[7];

		int countdice[][]=new int[2][7];
		for(int i=0;i<n;i++) {
			dice[rand.nextInt(6)+1]++;
		}
		System.out.println("no of times dice occured");
		for(int i=1;i<=6;i++) {
			countdice[0][i]=i;
			countdice[1][i]=dice[i];
		}
		
		for(int i=0;i<2;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print(countdice[i][j]+"\t");
			}
			System.out.println();
		}
		in.close();
	}
}
