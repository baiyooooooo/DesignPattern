package design.pattern.decorator;

public class ConcreteDecoratorB extends Decorator{
	private String addedState;
	
	@Override
	public void operation(){
		super.operation();
		this.addedState = "Concrete decoratorB special state";
		System.out.println(this.addedState);
	}
}
