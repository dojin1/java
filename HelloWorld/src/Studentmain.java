//조준호
public class Studentmain {
	
	public static void main(String[] args) {
		// 학생클래스로 인스턴스변수 s1을 만든다.
		// s1안의 필드들에 적당한 값을 넣는다.
		// s1안의 필드들의 값을 화면에 출력.
		Student s1 = new Student();
		//필드(변수)에 직접 접근.
		s1.name = "Juno";
		System.out.println("학생이름:"+s1.name);
		
		//메소드를 통해서 필드(변수)에 접근.
		s1.setBirthday("20001027");
		System.out.println("생년월일:"+s1.getBirthday());
		
		/* s1.birthday = "20001027";
		s1.gender = "male";
		s1.mobile = "01012345678";
		s1.nClass = "A";
		s1.nNumber = 33;
		s1.nYear = 3;
		System.out.println("학년:"+s1.nYear+"학년");
		System.out.println("반번호:"+s1.nClass+"반");
		System.out.println("학생번호:"+s1.nNumber+"번");
		System.out.println("생년월일:"+s1.birthday);
		System.out.println("성별:"+s1.gender);
		System.out.println("모바일번호:"+s1.mobile);
		*/
		
		
	}

}
