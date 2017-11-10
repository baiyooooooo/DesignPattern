package design.pattern.observer;

import java.lang.reflect.Method;

public class Event {
	private Object object;
	private String methodName;
	private Object[] params;
	private Class[] paramTypes;
	
	public Event(Object object, String method, Object[] args){
		this.object = object;
		this.methodName = method;
		this.params = args;
		contractParamTypes(this.params);
	}
	
	public void contractParamTypes(Object[] params){
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}
	
	public void invoke() throws Exception{
		Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
		if (method != null){
			method.invoke(this.object, this.params);
		}
	}
}
