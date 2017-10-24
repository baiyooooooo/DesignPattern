package design.pattern.abstractfactory;

public interface IDataBaseFactory {
	/*
	 * Use factory interface to abstract the objects which has relations
	 * For example tables have relations with each others because they all use one DB
	 * 
	 * Use object interface to abstract the certain object
	 * For example, create interface for each table
	 * To abstract every relevant method of table (CRUD)
	 * 
	 * Separate each kind of object in factory level
	 * But every factory all create object which implements the certain interface
	 * 
	 */
	
	// Each table has an instance to handle CURD
	IUser getUser();
	IDepartment getDepartment();
	
}
