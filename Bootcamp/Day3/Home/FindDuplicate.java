import java.util.*;
public class FindDuplicate {
	public static void main(String args[]) {
		Random rand=new Random();
		int a[]=new int[101];
		int count[]=new int[101];
		for(int i=1;i<=100;i++) {
			a[i]=i;
		}
		a[rand.nextInt(100)+1]=rand.nextInt(100)+1;
                for(int i=1;i<100;i++){
                   System.out.print(a[i]+" ");
}
		for(int i=1; i<=100; i++)  
	    {  
	        if(count[a[i]] == 1)  
	            System.out.println(a[i]);
	        else
	            count[a[i]]++;  
	    } 
	}

}
