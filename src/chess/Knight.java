package chess;

/**
 * Opgave(Nedarvning og polymorfi) - 2 SEM
 * Created by Mads Heilberg on 14-03-2017.
 */
public class Knight extends ChessPiece {

    public Knight(String color, int xPosition, int yPosition) {
        super("Knight", color, xPosition, yPosition);
    }

    /**
     * Overrides parent canMoveTo. Includes it's orignal implementation & adding further function.
     * Also validates: Knight moves 2 spots on one axis and 1 on the other in either direction.
     */
    @Override
    public boolean canMoveTo(int x, int y) {
        int xCount = Math.abs(x - getXPosition());
        int yCount = Math.abs(y - getYPosition());

        return super.canMoveTo(x, y) && ((xCount == 2 && yCount == 1) || (xCount == 1 && yCount == 2));
    }
}