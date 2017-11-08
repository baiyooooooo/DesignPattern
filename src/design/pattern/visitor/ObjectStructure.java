package design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Accepter> elements = new ArrayList<Accepter>();
	
	public void attach(Accepter accepter){
		elements.add(accepter);
	}
	
	public void detach(Accepter accepter){
		elements.remove(accepter);
	}
	
	public void startVisit(Visitor visitor){
		elements.forEach((item) -> {
			item.accept(visitor);
		});
	}
}
