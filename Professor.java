package t6;

public class Professor extends Dept{
	
	protected String course, rank;

	public Professor(String name, String phone, int salary) {
		super(name, phone, salary);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void setData(String type,String data){
		switch(type){
		case "Rank":
			this.rank = data;
			break;
		case "Course":
			this.course = data;
			break;
		case "DeptName":
			this.deptName = data;
			break;
		}
	}

	@Override
	public String toString() {
		return String.format(" %s: %s Professor of %s.\n==> Course: %s\n==> Salary: %d,  Phone#: %s ", name, rank,
				deptName, course, salary, phone);
	}

}
