import java.util.ArrayList;
import java.util.Scanner;

public class Hello13 {

	public static void main(String[] args) {
		// ArrayList/Scanner�̿�.
		// �л����� ���������� �о���̴� ���α׷�
		// -1�� ���ö����� ArrayList �Է°��� ä�����鼭 �þ��.
		// �о���̱Ⱑ ������,
		// (1) ��� �л��� ������ ���
		// (2) ������ ���հ�, ��������� ����ؼ� ���
		// �Ʒ� ��ƾ ����
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> point=new ArrayList<Integer>();
		System.out.println("�������� �Է�, -1 �Է½� ���� �� �������");
		int sum=0; //�հ�
		int t=s.nextInt();
		while(t!=-1) {
			point.add(t);
			t=s.nextInt();
		} 
		System.out.println("���� ���");
		for (int i=0; i<point.size(); i++) {
			System.out.println(point.get(i));
		}
		for (int i=0; i<point.size(); i++) {
			sum=sum+point.get(i);
		}
		
		System.out.println("���հ� : "+sum);
		System.out.println("������� : "+sum/point.size());
	}

}
