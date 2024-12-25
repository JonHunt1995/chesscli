public class rook implements chessPiece {
    // Attributes
    public char symbol;
    public int xPos;
    public int yPos;
    public boolean alive;
    public PositionType positionType;
    // Constructor
    public rook(int x, int y, Color color) {
        this.xPos = x;
        this.yPos = y;
        this.color = color;
        this.positionType = PositionType.ROOK;
        this.alive = true;
        if (color == Color.BLACK) {
            this.symbol = "";
        } else {
            this.symbol = "";
        }
    }
    // Methods
    public int getX();
    public int getY();
    public boolean validMove(int x, int y);
    public void range(int x, int y);
    public void die();
}