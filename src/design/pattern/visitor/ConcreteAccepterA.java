package design.pattern.visitor;

public class ConcreteAccepterA extends Accepter{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visiteConcreteAccepterA(this);
	}

}
