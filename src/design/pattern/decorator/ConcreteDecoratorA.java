package design.pattern.decorator;

public class ConcreteDecoratorA extends Decorator{
	private String addedState;
	
	@Override
	public void operation(){
		super.operation();
		this.addedState = "Concrete DecoratorA special state";
		System.out.println(this.addedState);
	}
}
