package design.pattern.bridge;

public class Circle extends Shape{
	private int radius;
	private int x;
	private int y;

	public Circle(int radius, int x, int y, IDraw draw) {
		super(draw);
		this.radius = radius;
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		draw.drawCircle(this.radius, this.x, this.y);
	}

}
