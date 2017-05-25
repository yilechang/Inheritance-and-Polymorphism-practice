package t6;

public class T6_405411439 {

	public static void main(String[] args) {
		
		int MAX=100;
		int numEmployees = 0;
		Employee emp[] = new Employee[MAX];
		
		emp[numEmployees] = new Professor("Jack Smith", "0968123456", 90000);
		emp[numEmployees].setData("Course","Data Structure"); // �б¡u��Ƶ��c�v�ҵ{
		emp[numEmployees].setData("Rank","Full"); // ���б�
		emp[numEmployees].setData("DeptName","Computer Science"); // ��T��Ǩt
		emp[numEmployees++] = new Professor("Steve Bush", "0921345678", 85000);
		emp[numEmployees].setData("Course","Operating Systems"); // �б¡u�@�~�t�Ρv�ҵ{
		emp[numEmployees].setData("Rank","Associate"); // �Ʊб�
		emp[numEmployees].setData("DeptName","Electrical Engineering");
		emp[numEmployees++] = new TA("John McDonold", "0988987654", 21000); // TA:�оǧU�z
		emp[numEmployees].setData("Grad","Master"); // �Ӥh�Z
		emp[numEmployees].setData("Course","Basic Computer Concepts"); // �u��T���סv�U��
		emp[numEmployees].setData("DeptName","Computer Science");
		emp[numEmployees++] = new TA("Amy Miller", "0938246801", 25000, "Doctoral"); // �դh�Z
		emp[numEmployees].setData("Course","C Programming"); // �uC�{���y���v�U��
		emp[numEmployees].setData("DeptName","Civil Engineering");
		emp[numEmployees++] = new RA("Alex Jones", "0939876543", 20000); // RA:��s�U�z
		emp[numEmployees].setData("Grad","Doctoral");
		emp[numEmployees].setData("ResearchID","NSC-2008-10"); // ��s�p�e�s��
		emp[numEmployees].setData("DeptName","Computer Science");
		emp[numEmployees++] = new RA("Mary Adams", "0941678954", 23000, "Master");
		emp[numEmployees].setData("ResearchID","NSC-2008-20");
		emp[numEmployees].setData("DeptName","Mathematics");
//		System.out.print(prof1 + "\n\n");
//		System.out.print(prof2 + "\n\n");
//		System.out.print(ta1 + "\n\n");
//		System.out.print(ta2 + "\n\n");
//		System.out.print(ra1 + "\n\n");
//		System.out.print(ra2 + "\n\n");
		
		for(int i=0;i<numEmployees;i++){
			System.out.println(emp[i]);
		}
	}

}

/*
 * Jack Smith: Full Professor of Computer Science.
 * ==> Course: Data Structure
 * ==> Salary: 90000, Phone#: 0968123456
 * 
 * Steve Bush: Associate Professor of Electrical Engineering. 
 * ==> Course:Operating Systems 
 * ==> Salary: 85000, Phone#: 0921345678
 * 
 * John McDonold: Teaching Assistant, Master program of Computer Science. 
 * ==>Course: Basic Computer Concepts 
 * ==> Salary: 21000, Phone#: 0988987654
 * 
 * Amy Miller: Teaching Assistant, Doctoral program of Civil Engineering. 
 * ==>Course: C Programming 
 * ==> Salary: 25000, Phone#: 0938246801
 * 
 * Alex Jones: Research Assistant of Computer Science. 
 * ==> Research ID:NSC-2008-10 
 * ==> Salary: 20000, Phone#: 0939876543
 * 
 * Mary Adams: Research Assistant of Mathematics. 
 * ==> Research ID: NSC-2008-20
 * ==> Salary: 23000, Phone#: 0941678954
 * 
 */
