

import java.util.Random;
import java.util.Scanner;

public class DeckofCards {
	
	
    public static void shuffle(String card[], int n) 
    { 
          
        Random rand = new Random(); 
          
        for (int i = 0; i < n; i++) 
        {  
            int r = i + rand.nextInt(52 - i); 
              
             String temp = card[r]; 
             card[r] = card[i]; 
             card[i] = temp; 
               
        } 
    } 
       
    public static void main(String[] args)  
    { 
       
        String a[] = {"c1","c2","c3","c4","c5","c6","c7","c8","c9","c10","cJ","cK","cQ",
        		"d1","d2","d3","d4","d5","d6","d7","d8","d9","d10","dJ","dK","dQ",
        		"h1","h2","h3","h4","h5","h6","h7","h8","h9","h10","hJ","hK","hQ",
        		"s1","s2","s3","s4","s5","s6","s7","s8","s9","s10","sJ","sK","sQ"}; 
       
        shuffle(a, 52); 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of players");
        int np=in.nextInt();
        System.out.println("Enter no of cards to distribute");
        int nc=in.nextInt();
        if(np*nc<=52) {
        	  int k=0;
        	  String cards[][]=new String[np][nc];
        	  for(int i=0;i<nc;i++) {
        		  for(int j=0;j<np;j++) {
        			  cards[j][i]=a[k];
        			  k++;
        		  }
        	  }
        	  for(int i=0;i<np;i++) {
        		  for(int j=0;j<nc;j++) {
        			  System.out.print(cards[i][j]+'\t');
        		  }
        		  System.out.println();
        	  }
        }
        else {
        	System.out.println("Cards are not sufficient a deck contains 52 crds");
        }
      
    } 
} 

