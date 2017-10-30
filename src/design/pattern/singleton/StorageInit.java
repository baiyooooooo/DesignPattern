package design.pattern.singleton;

/*
 * Class loader mechanism can make this way thread safety
 * Not lazy loading
 */
public class StorageInit {
	private static StorageInit oStorageInit = new StorageInit();
	private StorageInit(){}
	public static StorageInit getInstance(){
		return oStorageInit;
	}
}
