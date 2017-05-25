package t6;

public abstract class Employee {
	
	protected String name,phone;
	protected int salary;
	
	protected String type,data;
	
	public Employee(String name, String phone, int salary) {
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public abstract void setData(String type,String data);
}

