package chess;

/**
 * Opgave(Nedarvning og polymorfi) - 2 SEM
 * Created by Mads Heilberg on 14-03-2017.
 */
public class Main {

    public static void main(String[] args) {
        //create Array with 3 slots
        ChessPiece[] chessPieces = new ChessPiece[3];

        //indsætter brikker i Array
        chessPieces[0] = new Rook("Black", 2, 2);
        chessPieces[1] = new Bishop("White", 3, 7);
        chessPieces[2] = new Knight( "Dark", 4, 4);

        //loop + print
        for (ChessPiece piece : chessPieces){
            piece.show();
        }

        System.out.println("---------------------------------------------------");

        //moving bricks
        chessPieces[0].move(4,2);
        chessPieces[1].move(8,1);
        chessPieces[2].move(2,3);

        System.out.println("---------------------------------------------------");

        //loop + print
        for (ChessPiece piece : chessPieces){
            piece.show();
        }
    }
}
