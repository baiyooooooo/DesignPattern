package design.pattern.singleton;

/*
 * Class loader mechanism: thread safety
 * Lazy loading:
 * After RDMAFileController is loaded, the instance is not created.
 * When getInstance() is called, the instance is created.
 */
public class RDMAFileController {
	private static class RDMAFileControllerHolder{
		private static final RDMAFileController oRDMAFileController = new RDMAFileController();
	}
	private RDMAFileController(){}
	public static RDMAFileController getInstance(){
		return RDMAFileControllerHolder.oRDMAFileController;
	}

}
