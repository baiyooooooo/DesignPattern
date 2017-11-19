package design.pattern.bridge;

public class RedCircle implements IDraw{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Draw circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
