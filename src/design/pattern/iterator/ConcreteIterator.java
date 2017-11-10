package design.pattern.iterator;

public class ConcreteIterator extends Iterator{
	
	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return this.aggregate.getObject(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret = null;
		this.current++;
		if(current < this.aggregate.count()){
			ret = this.aggregate.getObject(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current >= this.aggregate.count();
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return this.aggregate.getObject(current);
	}
	
}
