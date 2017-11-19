package design.pattern.bridge;

public abstract class Shape {
	protected IDraw draw;
	protected Shape(IDraw draw){
		this.draw = draw;
	}
	
	public abstract void draw();
}
