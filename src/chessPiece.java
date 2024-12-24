public interface chessPiece {
    // Attributes
    public char symbol;
    public int xPos;
    public int yPos;
    public boolean alive;


    // Methods
    public int getX();
    public int getY();
    public boolean validMove(int x, int y);


}