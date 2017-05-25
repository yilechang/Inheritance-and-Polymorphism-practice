package t6;

public class TA extends Dept {
	
	private String course,grad;

	public TA(String name, String phone, int salary) {
		super(name, phone, salary);
	}

	public TA(String name, String phone, int salary, String grad) {
		super(name, phone, salary);
		this.grad = grad;
	}
	
	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
//	public void setData(String type,String data){
//		if(data==grad){
//			this.data = grad;
//		}else if(data==course){
//			this.data = course;
//		}else if(data==deptName){
//			this.data = deptName;
//		}
//	}
	
	public void setData(String type,String data){
		switch(data){
		case "grad":
			this.data = grad;
			break;
		case "course":
			this.data = course;
			break;
		case "deptName":
			this.data = deptName;
			break;
		}
	}

	@Override
	public String toString() {
		return String.format(" %s: Teaching Assistant, %s program of %s.\n==> Course: %s\n==> Salary: %d,  Phone#: %s ", name,
				 grad, deptName,course, salary, phone);
	}
	 
}
