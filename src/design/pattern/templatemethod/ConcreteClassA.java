package design.pattern.templatemethod;

public class ConcreteClassA extends TemplateClass{

	@Override
	public void primitiveOperationA() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " Operation A Specific");
	}

	@Override
	public void primitiveOperationB() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " Operation B Specific");
	}

}
