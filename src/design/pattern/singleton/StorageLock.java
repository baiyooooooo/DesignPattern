package design.pattern.singleton;

/*
 * Double check lock
 * volatile means oStorageLock is visible for all threads
 * Lazy loading
 * First check:
 * Only instance is null, lock the object
 * If instance is initialized, do not lock object
 * 
 * Second check:
 * Two threads, both getInstance() and in case instance is null,
 * both threads can pass the first check
 * Then, the first thread lock the object and create one object
 * The second thread need directly return the object which thread one created.
 * That is the reason why we should have second check 
 */
public class StorageLock {
	private volatile static StorageLock oStorageLock;
	private StorageLock(){}
	public static StorageLock getInstance(){
		if(oStorageLock == null){
			synchronized(StorageLock.class){
				if(oStorageLock == null){
					oStorageLock = new StorageLock();
				}
			}
		}
		return oStorageLock;
	}
}
