import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe board = new TicTacToe();
        int turns = 1;
        while (!board.hasWon()) {
            System.out.println("Turn: " + turns);
            board.getBoard();
            String input = sc.nextLine();
            if (turns % 2 == 1) {
                while (board.playerOneMove(input)) {
                    input = sc.nextLine();
                }
            }
            else {
                while (board.playerTwoMove(input)) {
                    input = sc.nextLine();
                }
            }
            turns++;
        }
    }
}
