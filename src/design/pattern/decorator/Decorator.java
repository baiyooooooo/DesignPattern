package design.pattern.decorator;

public class Decorator implements Component{
	protected Component component;
	
	public void setComponent(Component component){
		this.component = component;
	}
	
	@Override
	public void operation(){
		if(this.component != null){
			this.component.operation();
		}
	}
}
