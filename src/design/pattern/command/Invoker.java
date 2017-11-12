package design.pattern.command;

public class Invoker {
	// Command can be a list
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand(){
		this.command.execute();
	}
}
