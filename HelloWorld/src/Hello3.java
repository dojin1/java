import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		/*
		 * 1.����� �Է��� �޴´� (Scanner,nextLine())
		 * 2.�Է°��� "x"�� "���α׷� ����"�� ����ϰ� ���α׷� ����.
		 * 3.�Է°��� (a) "m"�̸� "�޴�����Ʈ" ��� (if-else if/switch)
		 * 			(b)	"b"�̸� "�ֹ�" ���
		 * 			(c)	"s"�̸� "������Ȳ" ���
		 * 4. (1)�� ���ư���.
		 */
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		while(!n.equals("x")) {
			switch(n) {
			case "m" : 
				System.out.println("�޴�����Ʈ"); break;
			case "b" :
				System.out.println("�ֹ�"); break;
			case "s" :
				System.out.println("������Ȳ"); break;
			
			}
			n=s.nextLine();
		}
		System.out.println("���α׷� ����");
		
		
	}
}
		
	  
	


