public interface chessPiece {
    // Attributes
    public char symbol;
    public int xPos;
    public int yPos;
    public boolean alive;
    public PositionType positionType;
    public Color color;


    // Methods
    public int getX();
    public int getY();
    public boolean validMove(int x, int y);
    public void range(int x, int y);

}