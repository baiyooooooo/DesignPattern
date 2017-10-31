package design.pattern.builder;

public abstract class PersonBuilder {
	protected String head;
	protected String body;
	protected String arms;
	
	public PersonBuilder(){
	}
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildArms();
}
