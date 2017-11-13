package design.pattern.adapter;

public class Center extends Player{

	public Center(String name, String position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Cannot understand English");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("Cannot understand English");
	}
}
