package design.pattern.prototype;

public abstract class ResumePrototype implements Cloneable {
	private String name;
	private String cellPhone;
	private WorkExperience workExperience;

	public ResumePrototype() {

	}

	public ResumePrototype(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	// Key method!
	public Object clone() {
		ResumePrototype clone = null;
		try {
			clone = (ResumePrototype) super.clone();
			clone.workExperience = (WorkExperience) this.workExperience.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
