
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class TicTacToe {
    static char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
    };
    static char currentPlayer = 'X';

    // Print board
    public static void printBoard() {
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    public static boolean checkwin() {
        // row and column
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
            // diagonal
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true;
            }
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + "  Enter the row and column:");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("This cell is taken please try again");
                continue;
            }
            if (checkwin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            // switch player
            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
        sc.close();
    }
}
