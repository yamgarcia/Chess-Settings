package parent_class;

public class ChessPiece {

	private boolean black;
	private int value;

	public ChessPiece(boolean color, int value) {
		
		setValue(value);
		setColor(color);
	}

	public boolean isBlack() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void move() {
		System.out.println("moving...");
	}

	@Override
	public String toString() {
		String sClassName = getClass().getName().substring(getClass().getName().lastIndexOf(".") + 1);
		return this.isColor() +" "+ sClassName ;
	}

	
}
