package t6;

public abstract class Dept extends Employee{
	
	protected String deptName; 
	
	public Dept(String name, String phone, int salary) {
		super(name, phone, salary);
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
