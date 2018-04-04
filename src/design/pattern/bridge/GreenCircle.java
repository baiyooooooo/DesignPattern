package design.pattern.bridge;

public class GreenCircle implements IDraw{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Draw circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
