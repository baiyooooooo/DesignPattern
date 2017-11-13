package design.pattern.adapter;

public abstract class Player {
	private String name;
	private String position;
	
	public Player(String name, String position){
		this.setName(name);
		this.position = position;
	}
	
	public abstract void attack();
	public abstract void defense();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
