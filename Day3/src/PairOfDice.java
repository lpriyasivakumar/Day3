public class PairOfDice {
	public Die Die1;
	public Die Die2;

	public PairOfDice() {
		Die1 = new Die();
		Die2 = new Die();
	}

	public PairOfDice(int sides) {
		Die1 = new Die(sides);
		Die2 = new Die(sides);
	}

	public void roll() {
		Die1.roll();
		Die2.roll();
	}

	public int getValue1() {
		return Die1.getValue();
	}

	public int getValue2() {
		return Die2.getValue();
	}

	public int getSum() {
		return getValue1() + getValue2();
	}

}
