import java.util.*;
public class Binary {
	
	static String decimaltobinary(int n){
		String s="";
		while(n>0) {
			s=n%2+s;
			n=n/2;
		}
		s=String.format("%08d",Integer.parseInt(s));
		System.out.println("Binar String : "+s);
	  return s;
	}
	
	static String swapnibble(String s) { 
		s=s.substring(s.length()/2,s.length())+s.substring(0,s.length()/2);
		System.out.println("After Swap nibbles : "+s);
		return s;
	}
	
	static void binarytodecimal(String s) {
		System.out.println("decimal after swap : "+Integer.parseInt(s,2));
	}
	
  public static void main(String args[]) {
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  String s;
	  s=Binary.decimaltobinary(n);
	  s=Binary.swapnibble(s);
	  Binary.binarytodecimal(s);
	  in.close();
	 }
}
