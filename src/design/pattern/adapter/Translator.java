package design.pattern.adapter;

public class Translator extends Player{

	public Translator(String name, String position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Chinese: " + this.getName() + " go attack!!");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("Chinese: " + this.getName() + " go defense!!");
	}


}
