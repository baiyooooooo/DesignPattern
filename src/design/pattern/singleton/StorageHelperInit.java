package design.pattern.singleton;

// Same as StorageInit
public class StorageHelperInit {
	private static StorageHelperInit oStorageHelperInit = null;
	static {
		oStorageHelperInit = new StorageHelperInit();
	}
	private StorageHelperInit(){}
	public static StorageHelperInit getInstance(){
		return oStorageHelperInit;
	}

}
