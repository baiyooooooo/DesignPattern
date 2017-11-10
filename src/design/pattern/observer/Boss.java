package design.pattern.observer;

public class Boss extends Subject{

	@Override
	public void addObserver(Object object, String methodName, Object...args) {
		// TODO Auto-generated method stub
		this.getEventHandler().addEvent(object, methodName, args);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		try{
			this.getEventHandler().notifySubcribe();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
