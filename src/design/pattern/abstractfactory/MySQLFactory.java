package design.pattern.abstractfactory;

public class MySQLFactory implements IDataBaseFactory{

	@Override
	public IUser getUser() {
		// TODO Auto-generated method stub
		return new MySQLUser();
	}

	@Override
	public IDepartment getDepartment() {
		// TODO Auto-generated method stub
		return new MySQLDepartment();
	}

}
