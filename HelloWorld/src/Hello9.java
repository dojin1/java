import java.util.Scanner;

public class Hello9 {

	public static void main(String[] args) {
		// ���� ���� �ΰ��� ������� �Է¹޴´�.
		// �ּҰ���� �ִ������� ���Ѵ�.
		// ���
		
		Scanner s=new Scanner(System.in);
		System.out.println("���� �Է�");
		int a=s.nextInt();
		int b=s.nextInt();
		
		int i=2; //�����°�?
		int max=0; //�ִ�����
		int min=0; //�ּҰ����
		// ex) a=12 , b=8
		// �ּҰ���� = a*b/�ִ�����
		// �ʱ�ȭ�� �������� ; �ʱ�ȭ�� �������ϰ�� "," ���ǽ� �������ϰ�� "&&" p122
		for(; i<=a && i<=b; i++) { 
			if(a%i==0 && b%i==0) 
				max=i;
									
		}
		min = a*b/max;
		System.out.println("�ִ����� : "+max);
		System.out.println("�ּҰ���� : "+min);
	}

}
