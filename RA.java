package t6;

public class RA extends Dept {

	private String researchID,grad;

	public RA(String name, String phone, int salary) {
		super(name, phone, salary);

	}

	public RA(String name, String phone, int salary, String grad) {
		super(name, phone, salary);
		this.grad = grad;
	}
	
	public String getResearchID() {
		return researchID;
	}

	public void setResearchID(String researchID) {
		this.researchID = researchID;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	public void setData(String type,String data){
		if(type==grad){
			this.grad = data;
		}else if(type==researchID){
			this.researchID = data;
		}else if(type==deptName){
			this.deptName = data;
		}
	}
	
//	public void setData(String type,String data){
//		switch(data){
//		case "grad":
//			this.data = grad;
//			break;
//		case "researchID":
//			this.data = researchID;
//			break;
//		case "deptName":
//			this.data = deptName;
//			break;
//		}
//	}
	
	@Override
	public String toString() {
		return String.format(" %s: Research Assistant of %s.\n==> Research ID: %s\n==> Salary: %d,  Phone#: %s ", name,
				deptName, researchID, salary, phone);
	}

}
