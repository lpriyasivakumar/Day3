public class Die {
	public int mSides;
	public int value;

	public Die() {
		this.mSides = 6;
	}

	public Die(int sides) {
		this.mSides = sides;
	}

	public void roll() {
		value = (int) ((Math.random() * (mSides-1))+1) ;
	}

	public int getValue() {
		return value;
	}

}
