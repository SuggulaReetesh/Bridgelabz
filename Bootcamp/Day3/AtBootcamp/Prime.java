import java.util.*;
public class Prime {
	int prime(int n)
	{
	    int i;
	    if(n<=1)
	    	return 0;
	    if(n==2 || n==3)
	    	return 1;
	    if(n%2==0 || n%3==0)
	    	return 0;
	    for(i=5;i<=Math.sqrt(n);i+=2)
	    {
	        if(n%i==0)
	        	return 0;
	    }
	    return 1;
	}
	public static void main(String args[]) {
		Prime p= new Prime();
		Scanner in=new Scanner(System.in);
		int start,end,check;
		System.out.print("start range");
		start=in.nextInt();
		System.out.print("end range");
		end=in.nextInt();
		for(int i=start;i<=end;i++) {
			 check= p.prime(i);
			 if(check==1)
				 System.out.println(i);
				 
		}
		in.close();
	}

}
