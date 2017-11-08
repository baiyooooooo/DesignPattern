package design.pattern.visitor;

public class ConcreteAccepterB extends Accepter{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visiteConcreteAccepterB(this);
	}

}
