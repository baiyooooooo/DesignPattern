package design.pattern.prototype;

public class WorkExperience implements Cloneable{
	private String company;
	private String projectName;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public Object clone(){
		Object object = null;
		try{
			object = super.clone();
		} catch (CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return object;
	}
}
