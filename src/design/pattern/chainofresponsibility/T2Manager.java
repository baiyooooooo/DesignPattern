package design.pattern.chainofresponsibility;

public class T2Manager extends Handler{

	public T2Manager(Handler superior) {
		super(superior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleFeeRequest(double fee) {
		// TODO Auto-generated method stub
		Handler superior = null;
		if(fee <= 10000){
			return "T2 manager approve.";
		} else {
			superior = this.getSuperior();
			if(superior != null){
				return superior.handleFeeRequest(fee);
			}
		}
		return "No body can approve";
	}

}
