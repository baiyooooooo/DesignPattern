package design.pattern.builder;

public class ThinPersonBuilder extends PersonBuilder{

	public ThinPersonBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		this.head = "small head";
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		this.body = "thin body";
	}

	@Override
	public void buildArms() {
		// TODO Auto-generated method stub
		this.arms = "two long arms";
	}
	
	public String getHead(){
		return this.head;
	}

}
