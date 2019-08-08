package chess_pieces;

import parent_class.ChessPiece;

public class Pawn extends ChessPiece {

	public Pawn(boolean color, int value) {
		super(color, value = 1);
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
		System.out.println("forward 1");
	}

}
