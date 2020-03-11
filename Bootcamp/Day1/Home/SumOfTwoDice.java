import java.util.*;
public class SumOfTwoDice {
	public static void main(String args[]) {
		int dice1,dice2;
		Random rand=new Random();
		dice1= rand.nextInt(6)+1;
		dice2=rand.nextInt(6)+1;
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println(dice1+dice2);
		
	}

}