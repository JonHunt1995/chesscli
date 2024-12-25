public interface chessPiece {
    // Methods
    public int getX();
    public int getY();
    public boolean validMove(int x, int y);
    public void range(int x, int y);
    public void die();

}