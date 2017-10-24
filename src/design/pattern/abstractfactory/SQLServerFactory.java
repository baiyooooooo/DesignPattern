package design.pattern.abstractfactory;

public class SQLServerFactory implements IDataBaseFactory{

	@Override
	public IUser getUser() {
		// TODO Auto-generated method stub
		return new SQLServerUser();
	}

	@Override
	public IDepartment getDepartment() {
		// TODO Auto-generated method stub
		return new SQLServerDepartment();
	}

}
