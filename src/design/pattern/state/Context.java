package design.pattern.state;

public class Context {
	private State state;
	
	public Context(State state){
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		System.out.println("Set state: " + state.getClass().getName());
		this.state = state;
	}
	
	public void request(){
		state.handle(this);
	}
}
