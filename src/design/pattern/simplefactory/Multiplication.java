package design.pattern.simplefactory;

public final class Multiplication implements IOperation{

	@Override
	public double execute(double byMultiplier, double multiplier) {
		// TODO Auto-generated method stub
		// byMultiplier 被乘数
		// multiplier 乘数
		return byMultiplier * multiplier;
	}

}
