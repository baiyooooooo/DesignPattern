package design.pattern.singleton;
/*
 * Not thread safety
 * Lazy loading
 * 
 */
public class DBInstance {
	private static DBInstance oDBInstance;
	private DBInstance(){}
	public static DBInstance getInstance(){
		if(oDBInstance == null){
			oDBInstance = new DBInstance();
		}
		return oDBInstance; 
	}

}
