

import java.util.*;
public class StringFunctions {
	private static Scanner in =new Scanner(System.in);
	public static String[] a1=new String[10000];
	public static int index;
	public static void check_for_anagram() {
		int count1[]=new int[256];
		int count2[] =new int[256];
		String s1,s2;
		s1=in.next();
		s2=in.next();
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagrams");
			
		}
		else {
			int check=0;
			for(int i=0;i<a.length;i++) {
				count1[a[i]]++;
			}
			for(int i=0;i<b.length;i++) {
				count2[b[i]]++;
			}
			for(int i=0;i<count1.length;i++) {
				if(count1[i]!=count2[i]) {
					check=0;
				}
				else {
					check=1;
				}
			}
			if(check==0)
				System.out.print("Not an anagram ");
			else
				System.out.print("Anagram");
		}
	}
	
	public static void check_for_palindrome() {
		
		
		String s1=in.next();
		String s2="";
		int l=s1.length()-1;
		while(l>=0) {
			
			s2=s2+s1.substring(l,l+1);
			l--;
		}
		if(s1.equals(s2))
			System.out.print("Palindrome");
		else 
			System.out.println("Not a palindrome");
		
	}
	
	public static String[] permutation_iteration(String s) {
		    String b[] = new String[10000];
		    int index=0;
		    char[] a = s.toCharArray();
		    int n = a.length;
		    int[] p = new int[n];
		    int i = 1; 
		    while (i < n) {
		        if (p[i] < i) { 
		            int j = ((i % 2) == 0) ? 0 : p[i];
		            swap(a, i, j);
		            b[index++]=join(a);
		            p[i]++; 
		            i = 1; 
		        }
		        else { 
		            p[i] = 0;
		            i++;
		        }
		    }
		    String c[]=new String[index+1];
		    for(int i1=0;i1<index;i1++) {
		    	c[i1]=b[i1];
		    }
		    c[index]=s;
		   
		 
		     
		    return c;
		}

	private static String join(char[] a) {
		    StringBuilder builder = new StringBuilder();
		    builder.append(a);
		    return builder.toString();
		}

	private static void swap(char[] a, int i, int j) {
		    char temp = a[i];
		    a[i] = a[j];
		    a[j] = temp;
		}

	public static void permutation_recursion(String p, String s) {
		
		if(s.length()==0) {
              a1[index]=p;
              index++;
              //System.out.println(p);
		}
		else {
			for(int i=0 ;i<s.length();i++) {
				permutation_recursion(p+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
			}
		}
		
	}
	
	public static void check(String[] arr1 ,String[] arr2) {
		String duplicate[]=new String[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			duplicate[i]=arr2[i];
		}
		Arrays.sort(arr1);
		Arrays.sort(duplicate);
		int check=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i].equals(duplicate[i]))
				check=1;
			else {
				check=0;
				break;
			}
			System.out.println(arr1[i]+" "+duplicate[i]);
		}
		if(check==1)
			System.out.println("Both are same");
		else
			System.out.println("Not same");
		
		
	}

	
	public static void main(String args[] ){
		System.out.println("1. check for anagrams");
		System.out.println("2. check for palindrome");
		System.out.println("3. permutation using iteration");
		System.out.println("4. permuataion using recursion");
		System.out.println("5. check 3 4 equal or not");
		int n=in.nextInt();
		switch(n) {
		case 1:check_for_anagram();
				break;
		case 2 : check_for_palindrome();
				break;
		case 3: String s=in.next();
			    permutation_iteration(s);
		        break;
		        
		case 4 :String s1=in.next();
		        String permutation="";
			    permutation_recursion(permutation,s1);
		        break;
		case 5:String s2=in.next();
		       permutation_recursion("",s2);
		       check(permutation_iteration(s2), a1);
		       break;
		       
		       
		        
		
		default:System.out.println("enter correct choice");       
		        
		}
        
       
		
	}

}
