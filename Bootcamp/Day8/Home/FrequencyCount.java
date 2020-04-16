
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
	public static void countFrequencies(String [] list) 
    { 
       
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        for (String i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
   
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println( val.getKey() +  ": " + val.getValue() + " times"); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
    	Scanner in =new Scanner(System.in);
    	int n=in.nextInt();
    	String [] a=new String [n];
    	for(int i=0;i<a.length;i++) {
    		a[i]=in.next();
    	} 
        countFrequencies(a); 
        in.close();
    } 

}
