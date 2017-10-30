package design.pattern.singleton;

/*
 * Thread safety
 * lazy loading
 * But the performance is bad
 */
public class Storage {
	private static Storage oStorage;
	private Storage(){}
	public static synchronized Storage getInstance(){
		if(oStorage == null){
			oStorage = new Storage();
		}
		return oStorage;
	}

}
