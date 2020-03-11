

import java.util.*;
public class K {
	public static void main(String args[]) {
		int rowlen=9;
		int collen=12;
		int k=collen;
		int l=collen/2;
		int col,rows;
		for(rows=0;rows<rowlen/2+1;rows++) {
			for(col=0;col<=collen;col++) {
					if(col==0 || col==1 ||col==k || col==k-1 || col==k-2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			k=k-2;
			System.out.println();
		}
		for(rows=rowlen/2+1;rows<rowlen;rows++) {
			for(col=0;col<=collen;col++) {
					if(col==0 || col==1 ||col==l || col==l-1 || col==l-2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			l=l+2;
			System.out.println();
		}
		
		
	}

}
