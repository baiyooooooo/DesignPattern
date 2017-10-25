package design.pattern.workspace.src;

import design.pattern.abstractfactory.*;
import design.pattern.prototype.*;
import design.pattern.simplefactory.*;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division oDivision = OperationFactory.getDivision();
		try {
			System.out.println(oDivision.execute(7, 0));
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}

		Addition oAddition = (Addition) OperationFactory.getOperationObject(Addition.class);
		System.out.println(oAddition.execute(1, 3));

		IDataBaseFactory mySQLFactory = new MySQLFactory();
		IUser mySQLUser = mySQLFactory.getUser();
		System.out.println(mySQLUser.getUserId());

		IDataBaseFactory sQLServerFactory = new SQLServerFactory();
		IUser sQLServerUser = sQLServerFactory.getUser();
		System.out.println(sQLServerUser.getUserId());
		
		ResumeForAlibaba oResumeForAlibaba = new ResumeForAlibaba();
		WorkExperience workExperience = new WorkExperience();
		workExperience.setCompany("SAP");
		workExperience.setProjectName("GTS");
		oResumeForAlibaba.setName("Bai Yubo");
		oResumeForAlibaba.setCellPhone("18817368100");
		oResumeForAlibaba.setWorkExperience(workExperience);
		System.out.println("Name: " + oResumeForAlibaba.getName() +
				", Cell Phone: " + oResumeForAlibaba.getCellPhone() + 
				", Work Experience: Company: " + oResumeForAlibaba.getWorkExperience().getCompany() +
				", Work Experience: Project: " + oResumeForAlibaba.getWorkExperience().getProjectName());
		
		ResumeForAlibaba oResume = (ResumeForAlibaba) oResumeForAlibaba.clone();
		oResume.setName("Yubo Bai");
		System.out.println("Name: " + oResume.getName() +
				", Cell Phone: " + oResume.getCellPhone() +
				", Work Experience: Company: " + oResume.getWorkExperience().getCompany() +
				", Work Experience: Project: " + oResume.getWorkExperience().getProjectName());


	}

}
