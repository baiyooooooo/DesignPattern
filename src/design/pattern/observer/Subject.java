package design.pattern.observer;

public abstract class Subject {
	private EventHandler eventHandler = new EventHandler();

	public EventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
	
	public abstract void addObserver(Object object, String methodName, Object...args);
	public abstract void notifyObservers();
}
