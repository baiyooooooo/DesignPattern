package design.parttern.simplefactory;

public final class Addition implements Operation{

	@Override
	public double execute(double addends, double addend) {
		// TODO Auto-generated method stub
		// addends 加数
		// addend 被加数
		return addends + addend;
	}

}
