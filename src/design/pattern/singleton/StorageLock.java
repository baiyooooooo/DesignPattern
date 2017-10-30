package design.pattern.singleton;

/*
 * Double check lock
 * volatile means oStorageLock is visible for all threads
 * Lazy loading
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
