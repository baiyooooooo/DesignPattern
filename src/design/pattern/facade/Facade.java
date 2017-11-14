package design.pattern.facade;

public class Facade {
	SubSystemA systemA;
	SubSystemB systemB;

	public Facade() {
		// TODO Auto-generated constructor stub
		this.systemA = new SubSystemA();
		this.systemB = new SubSystemB();
	}
	
	public void methodA(){
		this.systemA.methodA();
		this.systemB.methodA();
	}
	
	public void methodB(){
		this.systemA.methodB();
		this.systemB.methodB();
	}
}
