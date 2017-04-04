package chess;

/**
 * Opgave(Nedarvning og polymorfi) - 2 SEM
 * Created by Mads Heilberg on 14-03-2017.
 */
public class Bishop extends ChessPiece {

    public Bishop(String color, int xPosition, int yPosition) {
        super("Bishop", color, xPosition, yPosition);
    }

    /**
     * Overrides parent canMoveTo. Includes it's orignal implementation & adding further function.
     * Also validates: Bishop moves diagonally which means x and y == same distance travelled.
     */
    @Override
    public boolean canMoveTo(int x, int y) {
        return super.canMoveTo(x, y) && (Math.abs(x - getXPosition()) == Math.abs(y - getYPosition()));
    }
}
