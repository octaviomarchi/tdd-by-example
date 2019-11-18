package guru.springframework;

public class Money implements Expression{
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	protected String currency() {
        return currency;
    }

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		if (amount == money.amount && this.currency() == money.currency())
			return true;
		return false;
	}

	@Override
	public String toString() {
		return String.format("Money [amount=%s, currency=%s]", amount, currency);
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, this.currency);
	}
	
	public Expression plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}
	
}
