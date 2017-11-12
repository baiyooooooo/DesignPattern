package design.pattern.memento;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	public void setMemento(Memento memento){
		this.state = memento.getState();
	}
	
	public void showState(){
		System.out.println("State: " + this.state);
	}
}
