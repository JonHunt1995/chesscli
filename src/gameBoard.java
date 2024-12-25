public class gameBoard {
    // Constructor
    gameBoard() {
        this.resetBoard();
    }
    // Attributes
    private char[][] board = new Empty[8][8];
    private Color whoseTurn = Color.BLACK;
    private boolean draw = false;
    private boolean check = false;
    private boolean checkMate = false;
    // Methods
    public void resetBoard() {

    }
    public void printBoard() {
        for (row : board) {
            System.out.println("________");
            System.out.print("|");
            for (column : row) {
                System.out.print(column + "|");
            }
            System.out.println("");
        }
    }
}