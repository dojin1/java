import java.util.ArrayList;
import java.util.Scanner;

public class Menumain {

	public static void main(String[] args) {
		Menu menu = new Menu();
		// �޴��̸�/������ �Է��ϴ� ��ƾ
		// �޴��̸��� ""�� �ԷµǸ� ��ƾ(�ݺ���) ����.
		// �׵��� �Էµ� �޴���/���� ���.
		Scanner s1 = new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		menu.init();
		System.out.println("�޴���/���� �Է�, �޴����� �Է½� ���� �� �Էµ� �޴�/���� ���");
		String m=s1.nextLine(); //���ڿ� �Է¹ް� �ݺ������� �޴��迭�߰� �����Է¹ް� ���ݹ迭�߰�
		while(!m.equals("")) {	//�״��� ���ڿ��Է¹ް� �����ִ��� Ȯ�� �� �ݺ�. ���������� ��� ������ġ �߿�.
			menu.addName(m);
			int p=s2.nextInt();
			menu.addPrice(p);
			m=s1.nextLine();
		}
		menu.showMenu();
		
	}

}
