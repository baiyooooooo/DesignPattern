package design.pattern.chainofresponsibility;

public class T1Manager extends Handler{

	public T1Manager(Handler superior) {
		super(superior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleFeeRequest(double fee) {
		// TODO Auto-generated method stub
		Handler superior = null;
		if(fee <= 3000){
			return "T1 manager approve.";
		} else {
			superior = this.getSuperior();
			if(superior != null){
				return superior.handleFeeRequest(fee);
			}
		}
		return "No body can approve";
	}

}
