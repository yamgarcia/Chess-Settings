    
package main;

import chess_pieces.Bishop;
import chess_pieces.King;
import chess_pieces.Knight;
import chess_pieces.Pawn;
import chess_pieces.Queen;
import chess_pieces.Rook;
import parent_class.ChessPiece;

public class Main {

	public static void main(String[] args) {

//		int numberOfPawns = 16;
//		int numberOfKnights = 4;
//		int numberOfBishops = 4;
//		int numberOfRooks = 4;
//		int numberOfQueens = 2;
//		int numberOfKings = 2;
//		int numberOfCells = 8;

		ChessPiece[][] chessSetUp = new ChessPiece[8][8];

		// for (int i = 0; i < numberOfCells - 1; i++) {

		chessSetUp[0][0] = new Rook(false, 2);

		chessSetUp[0][1] = new Knight(false, 3);

		chessSetUp[0][2] = new Bishop(false, 4);

		chessSetUp[0][3] = new Queen(false, 9);

		chessSetUp[0][4] = new King(false, 1000);

		chessSetUp[0][5] = new Bishop(false, 4);

		chessSetUp[0][6] = new Knight(false, 3);

		chessSetUp[0][7] = new Rook(false, 2);

		for (int i = 0; i <= 7; i++) {

			chessSetUp[1][i] = new Pawn(false, 1);
		}

		// -----

		chessSetUp[7][0] = new Rook(true, 2);

		chessSetUp[7][1] = new Knight(true, 3);

		chessSetUp[7][2] = new Bishop(true, 4);

		chessSetUp[7][3] = new Queen(true, 9);

		chessSetUp[7][4] = new King(true, 1000);

		chessSetUp[7][5] = new Bishop(true, 4);

		chessSetUp[7][6] = new Knight(true, 3);

		chessSetUp[7][7] = new Rook(true, 2);

		for (int i = 0; i < 7; i++) {

			chessSetUp[6][i] = new Pawn(true, 1);

		}

		for (int i = 0; i < chessSetUp.length; i++) {

			for (int j = 0; j < chessSetUp.length; j++) {

				int c = 0;
				if (chessSetUp[i][j] instanceof ChessPiece) {
					System.out.print(chessSetUp[i][j].toString());
					c++;
					if (j > 6) {
						System.out.println();
					}
				} else {
					System.out.print("blank ");
					c++;
					if (j > 6) {
						System.out.println();
					}
				}
			}
		}
		//System.out.println(chessSetUp.length);

	}
}