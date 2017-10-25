package design.pattern.simplefactory;

public final class Addition implements IOperation{

	@Override
	public double execute(double addends, double addend) {
		// TODO Auto-generated method stub
		// addends 加数
		// addend 被加数
		return addends + addend;
	}

}
