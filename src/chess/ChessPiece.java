package chess;

import java.util.ArrayList;

 //*****************************************
 // Opgave(Nedarvning og polymorfi) - 2 SEM
 // Created by Mads Heilberg on 14-03-2017.
 //*****************************************
/**
 * Class for defining a chesspiece.
 * @author Mads Heilberg
 */
public abstract class ChessPiece {
    private String name, color;
    private int xPosition, yPosition;

    public ChessPiece(String name, String color, int xPosition, int yPosition){
        this.name = name;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /**
     * canMoveTo validates movement with boolean. Checks for movement within board boundary (1-8) and that the brick is
     * actually moved.
     * @param x coordinate of chesspiece on board
     * @param y coordinate of chesspiece on board
     * @return boolean validation
     */
    public boolean canMoveTo(int x, int y){
        return ((x >= 1 && x <= 8) && (y >= 1 && y <= 8)) && (!((x == xPosition) && (y == yPosition)));
    }


    /**
     * Translates the x coordinate to problem domain specifications (chess board) and returns String translation.
     * @param x coordinate of chesspiece on board
     * @param y coordinate of chesspiece on board
     * @return String translation
     */
    private String positionToField(int x, int y){
        String xToLetter = "";
        switch(x){
            case 1: xToLetter = "A"; break;
            case 2: xToLetter = "B"; break;
            case 3: xToLetter = "C"; break;
            case 4: xToLetter = "D"; break;
            case 5: xToLetter = "E"; break;
            case 6: xToLetter = "F"; break;
            case 7: xToLetter = "G"; break;
            case 8: xToLetter = "H"; break;
            default:
                System.out.print("[INVALID POSITION CONVERSION]");
        }
        return xToLetter + y;
    }

    /**
     * Saves all possible moves from current brick position after validation to list and returns that list to invokers.
     * @return ArrayList of moves possible
     * @see #canMoveTo(int, int)
     */
    private ArrayList<String> possibleMoves(){
        ArrayList<String> moves = new ArrayList<>();

        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                if (canMoveTo(x, y))
                moves.add(positionToField(x, y));
            }
        }
        return moves;
    }

    /**
     * Prints out brick attributes, current position and possible moves by looping the List created from possibleMoves.
     */
    public void show() {
        System.out.print("[" + color + " " + name + " " + positionToField(xPosition, yPosition) + "]\nCan move to: ");
        for (String move : possibleMoves()){
            System.out.print(move + ", ");
        }
        System.out.println("[END]");
    }

    /**
     * Prints requested move and completes the move by updating current position if validated.
     */
    public void move(int x, int y){
        System.out.println(color + " " + name + " " + positionToField(xPosition, yPosition) + " -> "
                    + positionToField(x, y));
        if (canMoveTo(x, y)){
            System.out.println("[VALID MOVE]");
            xPosition = x;
            yPosition = y;
        } else {
            System.out.println("[INVALID MOVE]");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}