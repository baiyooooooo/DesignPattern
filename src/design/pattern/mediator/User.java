package design.pattern.mediator;

public class User {
	private String name;
	
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
}
