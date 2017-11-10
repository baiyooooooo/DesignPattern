package design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
	
	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
	}
	
	public Object getObject(int index){
		return this.items.get(index);
	}
	
	public void setObject(int index, Object element){
		this.items.add(index, element);
	}

}
