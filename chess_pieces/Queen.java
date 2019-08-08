package chess_pieces;

import parent_class.ChessPiece;

public class Queen extends ChessPiece {

	public Queen(boolean color, int value) {
		super(color, value = 9);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String sClassName = getClass().getName().substring(getClass().getName().lastIndexOf(".") + 1);
		if (this.isColor()) {

			return "white" + " " + sClassName + "(" + this.getValue() + ")";
		} else {

			return "black" + " " + sClassName + "(" + this.getValue() + ")";
		}

	}
	
	public void move() {
		System.out.println("like a bishop or rook");
	}

}
