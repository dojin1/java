//조준호
public class Student {
	String name; //학생이름
	int nYear;	//학년
	String nClass; // 반번호
	int nNumber; // 학생번호
	String birthday; // 생년월일 20000325 (YYYYMMDD)
	String gender; // 성별 male/female
	String mobile; // 모바일번호 010xxxxzzzz
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getnYear() {
		return nYear;
	}
	public void setnYear(int nYear) {
		this.nYear = nYear;
	}
	public String getnClass() {
		return nClass;
	}
	public void setnClass(String nClass) {
		this.nClass = nClass;
	}
	public int getnNumber() {
		return nNumber;
	}
	public void setnNumber(int nNumber) {
		this.nNumber = nNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
