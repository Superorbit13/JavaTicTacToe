public class TicTacToe {
    private final int[][] board;
    public TicTacToe() {
        this.board = new int[3][3];
    }

    public void getBoard() {
        System.out.println("    a b c");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + "  ");
            System.out.print("[");
            for (int j =0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public boolean playerOneMove(String input) {
        try {
            char posOne = input.charAt(0);
            char posTwo = input.charAt(1);
            int tempOne = posOne - 96;
            int tempTwo = posTwo - 48;
            System.out.println(tempOne + " " + tempTwo);
            if ((this.board[tempTwo-1][tempOne-1] != 0)) {
                System.out.println("Someone already played there!");
                return true;
            }
            else {
                this.board[tempTwo-1][tempOne-1] = 1;
            }

            return false;

        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }

        return true;
    }

    public boolean playerTwoMove(String input) {
        try {
            char posOne = input.charAt(0);
            char posTwo = input.charAt(1);
            int tempOne = posOne - 96;
            int tempTwo = posTwo - 48;
            System.out.println(tempOne + " " + tempTwo);
            if ((this.board[tempTwo-1][tempOne-1] != 0)) {
                System.out.println("Someone already played there!");
                return true;
            }
            else {
                this.board[tempTwo-1][tempOne-1] = 2;
            }

            return false;

        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }

        return true;
    }

    public boolean hasWon() {
        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2] && this.board[i][0] != 0) {
                System.out.println("-------------------------------------------------");
                this.getBoard();
                System.out.println("Player " + this.board[i][0] + " wins!");

                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i] && this.board[0][i] != 0) {
                System.out.println("-------------------------------------------------");
                this.getBoard();
                System.out.println("Player " + this.board[0][i] + " wins!");

                return true;
            }
        }

        if (this.board[0][0] == this.board[1][1] && this.board[2][2] == this.board[0][0] && this.board[0][0] != 0) {
            System.out.println("-------------------------------------------------");
            this.getBoard();
            System.out.println("Player " + this.board[0][0] + " wins!");

            return true;
        }

        if (this.board[0][2] == this.board[1][1] && this.board[2][0] == this.board[1][1] && this.board[1][1] != 0) {
            System.out.println("-------------------------------------------------");
            this.getBoard();
            System.out.println("Player " + this.board[2][0] + " wins!");

            return true;
        }

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (this.board[i][j] == 0) {
                    return false;
                }
            }
        }

        System.out.println("-------------------------------------------------");
        this.getBoard();
        System.out.println("It's a tie???");
        return true;
    }
}
