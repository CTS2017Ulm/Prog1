public class RationalNumber
{
	//TODO exception handling for case 0
	private long numerator;
	private long denominator;

	public RationalNumber(long numerator, long denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		if (denominator < 0)
		{
			this.denominator = -this.denominator;
			this.numerator = -this.numerator;
		}
		simplify(numerator, denominator);
	}

	public long getNumerator()
	{
		return numerator;
	}

	public long getDenominator()
	{
		return denominator;
	}

	public String toString()
	{
		return "(" + numerator + "/" + denominator + ")";
	}

	public void simplify(long numerator, long denominator)
	{
		long x;
		long y;
		if (numerator > 0)
			x = numerator;
		else
			x = -numerator;
		if (denominator > 0)
			y = denominator;
		else
			y = -denominator;
		while (x != y)
		{
			if (x > y)
				x -= y;
			else
				y -= x;
		}
		this.numerator /= x;
		this.denominator /= x;
	}

	public RationalNumber multiply(RationalNumber r)
	{
		return new RationalNumber(numerator * r.numerator, denominator * r.denominator);
	}

	public RationalNumber divide(RationalNumber r)
	{
		long temp = r.denominator;
		r.denominator = r.numerator;
		r.numerator = temp;
		return multiply(r);
	}

	public RationalNumber add(RationalNumber r)
	{
		return new RationalNumber(numerator * r.denominator + r.numerator * denominator, denominator * r.denominator);
	}

	public RationalNumber substract(RationalNumber r)
	{
		return new RationalNumber(numerator * r.denominator - r.numerator * denominator, denominator * r.denominator);
	}
}
