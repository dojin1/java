//����ȣ
public class Studentmain {
	
	public static void main(String[] args) {
		// �л�Ŭ������ �ν��Ͻ����� s1�� �����.
		// s1���� �ʵ�鿡 ������ ���� �ִ´�.
		// s1���� �ʵ���� ���� ȭ�鿡 ���.
		Student s1 = new Student();
		//�ʵ�(����)�� ���� ����.
		s1.name = "Juno";
		System.out.println("�л��̸�:"+s1.name);
		
		//�޼ҵ带 ���ؼ� �ʵ�(����)�� ����.
		s1.setBirthday("20001027");
		System.out.println("�������:"+s1.getBirthday());
		
		/* s1.birthday = "20001027";
		s1.gender = "male";
		s1.mobile = "01012345678";
		s1.nClass = "A";
		s1.nNumber = 33;
		s1.nYear = 3;
		System.out.println("�г�:"+s1.nYear+"�г�");
		System.out.println("�ݹ�ȣ:"+s1.nClass+"��");
		System.out.println("�л���ȣ:"+s1.nNumber+"��");
		System.out.println("�������:"+s1.birthday);
		System.out.println("����:"+s1.gender);
		System.out.println("����Ϲ�ȣ:"+s1.mobile);
		*/
		
		
	}

}
