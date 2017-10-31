package design.pattern.builder;

public class PersonDirector {
	private PersonBuilder oPersonBuilder;
	public PersonDirector(PersonBuilder oPersonBuilder){
		this.oPersonBuilder = oPersonBuilder;
	}
	public void createPerson(){
		this.oPersonBuilder.buildHead();
		this.oPersonBuilder.buildBody();
		this.oPersonBuilder.buildArms();
	}
}
