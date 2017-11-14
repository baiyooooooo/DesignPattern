package design.pattern.proxy;

public class Proxy implements Subject{
	
	private RealSubject subject;
	
	public Proxy(RealSubject subject){
		this.subject = subject;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(this.subject != null){
			System.out.println("Come from proxy");
			this.subject.request();
		}
	}

}
