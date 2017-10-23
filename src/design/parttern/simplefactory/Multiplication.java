package design.parttern.simplefactory;

public final class Multiplication implements Operation{

	@Override
	public double execute(double byMultiplier, double multiplier) {
		// TODO Auto-generated method stub
		// byMultiplier 被乘数
		// multiplier 乘数
		return byMultiplier * multiplier;
	}

}
