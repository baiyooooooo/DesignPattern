package design.pattern.chainofresponsibility;

public class Approver {
	private T2Manager t2Manager = new T2Manager(null);
	private T1Manager t1Manager = new T1Manager(t2Manager);
	public String approveFee(double fee){
		return t1Manager.handleFeeRequest(fee);
	}
}
