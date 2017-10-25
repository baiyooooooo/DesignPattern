package design.pattern.simplefactory;

public final class SubParty implements IOperation {

	@Override
	public double execute(double base, double times) {
		// TODO Auto-generated method stub
		return Math.pow(base, times);
	}

}
