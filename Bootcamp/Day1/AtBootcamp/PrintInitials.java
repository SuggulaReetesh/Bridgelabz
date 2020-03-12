

public class PrintInitials {
	
	public void K() {
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
	
	public void D() {
		int rowlen=9,collen=14;
		int k,l;
		k=rowlen;
		l=collen-2;
		int col,rows;
		for(rows=0;rows<=2*(rowlen/3)-1;rows++) {
			for(col=0;col<collen;col++) {
				
				if(rows==0 ) {
					if(col<=rowlen)
						System.out.print("*");
				}
				
			    if(rows>=1 && rows<=rowlen/3-1) {
			    	
			    	if(col==0 || col==1 || col==k||col==k+1)
			    		System.out.print("*");
			        else
			    		System.out.print(" ");
			    }
			    
			    if(rows>=rowlen/3 && rows<=2*(rowlen/3)-1) {
			    	
			    	if(col== 0||col==1 || col==collen-1 || col==collen-2) 
			    		System.out.print("*");
			    	else 
			    		System.out.print(" ");
			    }
		    }
			k=k+1;
			System.out.println();
		}
		
		for(rows=2*(rowlen/3);rows<=rowlen;rows++) {
			for(col=0;col<collen;col++) {
				
				if(rows==rowlen-1 && col<=rowlen)
					System.out.print("*");
				
				if(rows>=2*(rowlen/3) && rows<=rowlen-2) {
					if(col==0 || col==1 || col==l || col==l-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			l=l-1;
			System.out.println();
		}
	}
    
	public void W() {
		int rowlen=9;
		int collen=30;
		int colmid=collen/2;
		int l=collen;
		int rows,col;
		for(rows=0;rows<rowlen;rows++) {
			for(col=0;col<=collen;col++) {
				
				if(rows==0) {
					if(col==rows || col==rows+1||col==colmid|| col==l || col==l-1 ) 
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				if(rows==1) {
					if(col==rows || col==rows+1|| col==colmid-rows||col==colmid|| col==colmid+rows || col==l || col==l-1 )
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				if(rows>=2 && rows <=rowlen-2) {
					if(col==rows || col==rows+1|| col==colmid-rows||col==colmid-rows+1 || col==colmid+rows ||col==colmid+rows-1 || col==l || col==l-1 ) 
							System.out.print("*");
					else 
							System.out.print(" ");
				}
				if(rows==rowlen-1) {
					if(col==rows || col==colmid+rows-1  )
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			l=l-1;
			System.out.println();
		}
	}

public static void main(String args[]) {
	PrintInitials pi=new PrintInitials();
	pi.K();
	pi.D();
	pi.W();
	
}
	
	

}
