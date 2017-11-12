package design.pattern.interpreter;

public class TerminalExpression implements IExpression{
	
	private String maleName;
	
	public TerminalExpression(String maleName) {
		// TODO Auto-generated constructor stub
		this.maleName = maleName;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return context.contains(maleName);
	}

}
