package design.pattern.visitor;

public class ConcreteVisitorA extends Visitor{

	@Override
	public void visiteConcreteAccepterA(ConcreteAccepterA concreteAccepterA) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " visit " + concreteAccepterA.getClass().getName());
	}

	@Override
	public void visiteConcreteAccepterB(ConcreteAccepterB concreteAccepterB) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " visit " + concreteAccepterB.getClass().getName());
	}

}
