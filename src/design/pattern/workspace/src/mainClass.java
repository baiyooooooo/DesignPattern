package design.pattern.workspace.src;

import design.pattern.abstractfactory.*;
import design.pattern.builder.*;
import design.pattern.chainofresponsibility.*;
import design.pattern.command.*;
import design.pattern.iterator.*;
import design.pattern.memento.*;
import design.pattern.observer.*;
import design.pattern.prototype.*;
import design.pattern.simplefactory.*;
import design.pattern.strategy.*;
import design.pattern.templatemethod.*;
import design.pattern.visitor.*;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleFactoryTest();
		abstractFactoryTest();
		prototypeTest();
		builderTest();
		strategyTest("rebate");
		chainOfResponsibility();
		visitor();
		templateMethod();
		observer();
		iterator();
		command();
		memento();
	}

	public static void simpleFactoryTest() {

		Division oDivision = OperationFactory.getDivision();
		try {
			System.out.println(oDivision.execute(7, 0));
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}

		Addition oAddition = (Addition) OperationFactory.getOperationObject(Addition.class);
		System.out.println(oAddition.execute(1, 3));
	}

	public static void abstractFactoryTest() {

		IDataBaseFactory mySQLFactory = new MySQLFactory();
		IUser mySQLUser = mySQLFactory.getUser();
		System.out.println(mySQLUser.getUserId());

		IDataBaseFactory sQLServerFactory = new SQLServerFactory();
		IUser sQLServerUser = sQLServerFactory.getUser();
		System.out.println(sQLServerUser.getUserId());
	}

	public static void prototypeTest() {
		ResumeForAlibaba oResumeForAlibaba = new ResumeForAlibaba();
		WorkExperience workExperience = new WorkExperience();
		workExperience.setCompany("SAP");
		workExperience.setProjectName("GTS");
		oResumeForAlibaba.setName("Bai Yubo");
		oResumeForAlibaba.setCellPhone("18817368100");
		oResumeForAlibaba.setWorkExperience(workExperience);
		System.out.println("Name: " + oResumeForAlibaba.getName() + ", Cell Phone: " + oResumeForAlibaba.getCellPhone()
				+ ", Work Experience: Company: " + oResumeForAlibaba.getWorkExperience().getCompany()
				+ ", Work Experience: Project: " + oResumeForAlibaba.getWorkExperience().getProjectName());

		ResumeForAlibaba oResume = (ResumeForAlibaba) oResumeForAlibaba.clone();
		oResume.setName("Yubo Bai");
		System.out.println("Name: " + oResume.getName() + ", Cell Phone: " + oResume.getCellPhone()
				+ ", Work Experience: Company: " + oResume.getWorkExperience().getCompany()
				+ ", Work Experience: Project: " + oResume.getWorkExperience().getProjectName());

	}

	public static void builderTest() {
		ThinPersonBuilder oTPB = new ThinPersonBuilder();
		PersonDirector oPD = new PersonDirector(oTPB);
		oPD.createPerson();
		System.out.println("Head:" + oTPB.getHead());
	}

	public static void strategyTest(String type) {
		double totalPrices = 12.34d;

		CashContext cc = new CashContext(type);
		System.out.println(cc.getResult(totalPrices));
	}

	public static void chainOfResponsibility() {
		Approver approver = new Approver();
		System.out.println(approver.approveFee(2300));
		System.out.println(approver.approveFee(4300));
		System.out.println(approver.approveFee(40300));
	}

	public static void visitor() {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new ConcreteAccepterA());
		objectStructure.attach(new ConcreteAccepterB());
		ConcreteVisitorA visitor = new ConcreteVisitorA();
		objectStructure.startVisit(visitor);
	}

	public static void templateMethod() {
		ConcreteClassA concreteClassA = new ConcreteClassA();
		ConcreteClassB concreteClassB = new ConcreteClassB();
		concreteClassA.templateMethod();
		concreteClassB.templateMethod();
	}
	
	public static void observer(){
		Boss boss = new Boss();
		NBAObserver nbaObserver = new NBAObserver();
		TVObserver tvObserver = new TVObserver();
		boss.addObserver(nbaObserver, "stopNBALive");
		boss.addObserver(tvObserver, "stopTV");
		boss.notifyObservers();
	}
	
	public static void iterator(){
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.setObject(0, "A1");
		aggregate.setObject(1, "A2");
		aggregate.setObject(2, "A3");
		aggregate.setObject(3, "A4");
		aggregate.setObject(4, "A5");
		aggregate.setObject(5, "A6");
		
		Iterator i = new ConcreteIterator(aggregate);
		Object item = i.first();
		System.out.println("First item: " + item);
		while (!i.isDone()){
			System.out.println(i.CurrentItem());
			i.next();
		};
	}
	
	public static void command(){
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.executeCommand();
	}
	
	public static void memento(){
		Originator originator = new Originator();
		originator.setState("Originator initialized");
		originator.showState();
		
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(originator.createMemento());
		
		originator.setState("Originator Finished");
		originator.showState();
		
		originator.setMemento(careTaker.getMemento());
		originator.showState();
	}

}
