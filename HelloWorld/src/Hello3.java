import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		/*while��.
		 * 1.����� �Է��� �޴´� (Scanner,nextLine())
		 * 2.�Է°��� "x"�� "���α׷� ����"�� ����ϰ� ���α׷� ����.
		 * 3.�Է°��� (a) "m"�̸� "�޴�����Ʈ" ��� (if-else if/switch)
		 * 			(b)	"b"�̸� "�ֹ�" ���
		 * 			(c)	"s"�̸� "������Ȳ" ���
		 * 4. (1)�� ���ư���.
		 */
		Scanner n = new Scanner (System.in);
		String z = n.nextLine();
		while (!z.equals("x")) {
			switch (z) {
			case ("m") :
				System.out.println("�޴�����Ʈ");
				break;
			case ("b") :
				System.out.println("�ֹ�");
				break;
			case ("s") :
				System.out.println("������Ȳ");
				break;
			default :
				System.out.println("����");
			}
			z = n.nextLine();
		}
		System.out.println("���α׷� ����");
	}
}
	

		
	  
	


