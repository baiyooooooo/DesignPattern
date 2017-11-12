package design.pattern.interpreter;

public class OrExpression implements IExpression{
// Non-Terminal Expression
	
	private IExpression expr1 = null;
	private IExpression expr2 = null;
	
	public OrExpression(IExpression expr1, IExpression expr2){
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return this.expr1.interpret(context) || this.expr2.interpret(context);
	}

}
