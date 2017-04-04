package chess;

/**
 * Opgave(Nedarvning og polymorfi) - 2 SEM
 * Created by Mads Heilberg on 14-03-2017.
 */
public class Rook extends ChessPiece {

    public Rook(String color, int xPosition, int yPosition) {
        super("Rook", color, xPosition, yPosition);
    }

    /**
     * Overrides parent canMoveTo. Includes it's orignal implementation & adding further function.
     * Also validates: Rook only moves freely by either row or column so either x or y must == current.
     */
    @Override
    public boolean canMoveTo(int x, int y) {
        return super.canMoveTo(x, y) && (getXPosition() == x || getYPosition() == y);
    }
}
