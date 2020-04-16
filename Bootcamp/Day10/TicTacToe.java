

import java.util.Scanner;

public class TicTacToe {
	static final int player = 1;
	static final int computer = 2;
	static final int draw = 3;

	public static void print_board(int[][] board) {
		System.out.print(printChar(board[0][0]));
		System.out.print("|");
		System.out.print(printChar(board[0][1]));
		System.out.print("|");
		System.out.println(printChar(board[0][2]));
		System.out.println("-----");
		System.out.print(printChar(board[1][0]));
		System.out.print("|");
		System.out.print(printChar(board[1][1]));
		System.out.print("|");
		System.out.println(printChar(board[1][2]));
		System.out.println("-----");
		System.out.print(printChar(board[2][0]));
		System.out.print("|");
		System.out.print(printChar(board[2][1]));
		System.out.print("|");
		System.out.println(printChar(board[2][2]));
	}

	public static int checkWinner(int[][] board) {

		if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
			return board[0][0];

		if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
			return board[1][0];

		if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
			return board[2][0];

		if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
			return board[0][0];

		if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
			return board[0][1];

		if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
			return board[0][2];

		if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
			return board[0][0];

		if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
			return board[0][2];

		if (board[0][0] == 0 || board[0][1] == 0 || board[0][2] == 0 || board[1][0] == 0 || board[1][1] == 0
				|| board[1][2] == 0 || board[2][0] == 0 || board[2][1] == 0 || board[2][2] == 0)
			return 0;

		return draw;
	}

	public static char printChar(int b) {
		switch (b) {
		case 0:
			return ' ';
		case player:
			return 'X';
		case computer:
			return 'O';
		}
		return ' ';
	}

	public static int computer_move(int[][] board) {
		int move = (int) (Math.random() * 9);

		while (board[move / 3][move % 3] != 0)
			move = (int) (Math.random() * 9);

		return move;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int turn = player;
		int[][] board = new int[3][3];
		int move;
		int winner;

		System.out.println("Tic-Tac-Toe");
		System.out.println("You vs computer!");
		System.out.println("Enter 1-9 to indicate your move");

		print_board(board);

		while (true) {
			if (turn == player) {
				System.out.println("Your move");
				move = -1;
				while (move < 0 || move > 9 || board[move / 3][move % 3] != 0) {
					System.out.println("Please enter your move(1-9): ");
					move = in.nextInt();
					move = move - 1;
				}
			} else {
				move = computer_move(board);
				System.out.println("computer move: " + move);
			}

			board[(int) (move / 3)][move % 3] = turn;
			print_board(board);

			winner = checkWinner(board);

			if (winner != 0)
				break;

			if (turn == player) {
				turn = computer;
			} else {
				turn = player;
			}
		}

		switch (winner) {
		case player:
			System.out.println("You won!");
			break;
		case computer:
			System.out.println("computer won!");
			break;
		default:
			System.out.println("Tie!");
			break;
		}
	}
}