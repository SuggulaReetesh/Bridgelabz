import java.util.Scanner;

public class Cos {
	public static void main(String[] args) { 
		Scanner in=new Scanner(System.in);
        double angle = in.nextDouble();

        angle= angle% (2 * Math.PI);
        double eachterm = 1.0;     
        double value  = 0.0; 
        int totalterms=0;

        for (int i = 1; eachterm != 0.0; i++) {
            eachterm *= (angle / i);
            if(i % 2 == 0)        //here is condition 2,4,6
            {   totalterms++;
                if(totalterms % 2 == 0)
                {   value -= eachterm;
                }
                else
                {   value += eachterm;
                }
            }
        }
        System.out.println(value);
        in.close();
    }

}