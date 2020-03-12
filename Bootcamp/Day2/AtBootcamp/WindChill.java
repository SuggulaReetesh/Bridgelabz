import java.util.*;
public class WindChill {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		double t,v,w;
		System.out.println("Temperature");
        t=in.nextInt();
        System.out.println("wind speed");
        v=in.nextInt();
        if(Math.abs(t)<=50 && v<=120 || v>=3) {
        	w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
            System.out.print(w);
        }
        else
        	System.out.print("Check for the values conditions");
        	
        in.close();
	}

}
