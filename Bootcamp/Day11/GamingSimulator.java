

import java.util.*;

public class GamingSimulator {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("stake");
		int stake = in.nextInt();
		System.out.println("goal");
		int goal = in.nextInt();
		System.out.println("trails");
		int trials = in.nextInt();
		int wins = 0;
		int loss = 0;
        int bets=0;
		for (int t = 0; t < trials; t++) {
            bets++;
			int money = stake;
			while (money > 0 && money < goal) {
				if (Math.random() < 0.5)
					money++;
				else
					money--;
			}
			if (money == goal)
				wins++;
			else {
				loss++;
			}
		}

		String stats[][] = new String[2][3];
		stats[0][0] = "wins";
		stats[0][1] = "loss";
		stats[0][2] = "Gaming simulation";
		stats[1][0] = Integer.toString(wins);
		stats[1][1] = Integer.toString(loss);
		if (loss > wins) {
			stats[1][2] = "loss";
		} else if (loss < wins) {
			stats[1][2] = "wins";
		} else {
			stats[1][2] = "draw";
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(stats[i][j] + "\t");
			}
			System.out.println();
		}
		in.close();
	}

}
