
public class Student {
	//멤버변수 private department,grade,id,name,address
	protected String department; //학과
	String grade; //학년
	String id; //학번
	String name; //이름
	String address; //주소
	
	public Student(String nGrade, String strId, String strname, String strAddress, String strEmail) {
		// TODO Auto-generated constructor stub
		//super(nGrade, strId, strname, strAddress, strEmail);
		this.grade = nGrade;
		this.id = strId;
		this.name = strname;
		this.address = strAddress;
		this.email = strEmail;
		
	}
	
	//SetDepartment 메소드를 구현해서 학과 메소드로 get()
	public void SetDepartment(String strDepartment) {
		this.department = strDepartment;
	}

}
