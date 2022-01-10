
public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + ", studentid=" + studentid + "]";
	}
	String name ;
	String collegeName;
	String studentid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public Student(String name,String collegeName,String studentid)
	{
		this.name=name;
		this.collegeName=collegeName;
		this.studentid=studentid;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
