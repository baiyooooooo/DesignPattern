package design.pattern.workspace.src;

import design.parttern.simplefactory.*;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division oDivision = OperationFactory.getDivision();
		try {
			System.out.println(oDivision.execute(7, 0));
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}

		Addition oAddition = (Addition) OperationFactory.getOperationObject(Addition.class);
		System.out.println(oAddition.execute(1, 3));
	}

}
