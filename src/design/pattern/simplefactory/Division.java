package design.pattern.simplefactory;

public final class Division implements IOperation {

	@Override
	public double execute(double dividend, double divisor) {
		// TODO Auto-generated method stub
		// dividend 被除数
		// divisor 除数
		if (divisor == 0) {
			throw new RuntimeException("Divisor cannot be 0");
		}
		return dividend / divisor;
	}

}
