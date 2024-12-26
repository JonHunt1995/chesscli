public class gameBoard {
    // Constructor
    gameBoard() {
        this.resetBoard();
    }
    // Attributes
    private int turnNumber = 0;
    private char[][] board = new Empty[8][8];
    private Color whoseTurn = Color.BLACK;
    private boolean draw = false;
    private boolean check = false;
    private boolean checkMate = false;
    // Methods
    public void resetBoard() {
        turnNumber = 0;
        this.board = new char[8][8];
        positionType[] whiteChessPieces = {}
    }
    public void printBoard() {
        rowNumber = 8;
        System.out.println(" ABCDEFGHI ");
        for (row : board) {
            System.out.print(rowNumber);
            for (column : row) {
                System.out.print(column.symbol);
            }
            System.out.println(rowNumber);
            rowNumber --;
            System.out.println(" ABCDEFGHI ");
        }
    }
}