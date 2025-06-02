import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();

        while (gameRunning) {
            System.out.print("Player " + currentPlayer + ", enter your move (1-9): ");
            int move = scanner.nextInt();

            if (isValidMove(move)) {
                placeMove(move, currentPlayer);
                printBoard();

                if (checkWin(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isDraw()) {
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    // Print the game board
    public static void printBoard() {
        System.out.println();
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(" " + cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if move is valid
    public static boolean isValidMove(int move) {
        if (move < 1 || move > 9) return false;

        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        return board[row][col] != 'X' && board[row][col] != 'O';
    }

    // Place the move on the board
    public static void placeMove(int move, char player) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = player;
    }

    // Check for a win
    public static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player &&
                 board[i][1] == player &&
                 board[i][2] == player) ||
                (board[0][i] == player &&
                 board[1][i] == player &&
                 board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        return (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) ||
               (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player);
    }

    // Check for draw
    public static boolean isDraw() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell != 'X' && cell != 'O') {
                    return false;
                }
            }
        }
        return true;
    }
}
