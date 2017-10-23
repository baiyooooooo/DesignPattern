package design.parttern.simplefactory;

public class OperationFactory {
	/*
	 * Use method to get instance rather than specify a instance type with
	 * string. Do this because if type string is specified incorrectly, no
	 * instance return. We can use enum to limit the instance type but it's not
	 * the best way.
	 * 
	 * Use static because operation is kind of basic function, we do not need to
	 * create an instance for factory. Directly use static to get operations
	 * 
	 */

	public static Addition getAdd() {
		return new Addition();
	}

	public static Subtraction getMinus() {
		return new Subtraction();
	}

	public static Multiplication getMultiplication() {
		return new Multiplication();
	}

	public static Division getDivision() {
		return new Division();
	}

	/*
	 * Use reflect Not suggest because you can use this function to create any
	 * instance even the instance type is not defined in factory
	 * 
	 * and you have to force conversion new instance to the aim object
	 */
	public static Object getOperationObject(Class<? extends Operation> oObj) {
		Object oOperation = null;
		try {
			oOperation = Class.forName(oObj.getName()).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return oOperation;
	}

}
