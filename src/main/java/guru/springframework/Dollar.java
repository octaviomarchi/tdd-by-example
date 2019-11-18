package guru.springframework;

public class Dollar {

	private int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times( int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		Dollar other = (Dollar) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
	
	
}
