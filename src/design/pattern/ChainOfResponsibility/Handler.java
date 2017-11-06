package design.pattern.ChainOfResponsibility;

public abstract class Handler {
	protected Handler superior = null;

	public Handler(Handler superior){
		this.superior = superior;
	}
	
	public Handler getSuperior(){
		return this.superior;
	}
	
	public void setSuperior(Handler superior){
		this.superior = superior;
	}
	
	public abstract String handleFeeRequest(double fee);
}
