package design.pattern.templatemethod;

public abstract class TemplateClass {
	
	public abstract void primitiveOperationA();
	public abstract void primitiveOperationB();
	
	public void templateMethod(){
		this.primitiveOperationA();
		this.primitiveOperationB();
	}

}
