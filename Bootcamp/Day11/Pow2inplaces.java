

import java.util.Scanner;

public class Pow2inplaces {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number to get powers of 2");
		n=in.nextInt();
		int A[][]=new int[n+1][11];
		int count=1;
		for(int i=1;i<=n;i++) {
			int num= (int) Math.pow(2, i);
			int j=1;
			while(num>0) {
				int r=num%10*(int)Math.pow(10,j-1);
				A[count][j]=r;
				num=num/10;
				j++;
			}
			count++;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<10;j++) {
				if(A[i][j]>0) {
					System.out.print(A[i][j]+"\t");
				}
			}
			System.out.println();
		}
		in.close();
	}

	
}
