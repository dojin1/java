import java.util.Scanner;

public class Sddd {

	public static void main(String[] args) {
		// for������ 1���� 10���� ���
	Scanner s=new Scanner(System.in);
	int a, b, max=0, min=0, i=2;
	System.out.println("�� �� �Է� : ");
	a = s.nextInt();
	b = s.nextInt();
	for(; i<=a && i<=b; i++) {
		if(a%i==0 && b%i==0) 
			min=1;
			
		
			
		
	}
	max=a*b/min;
	System.out.println("�ּҰ���� : " + max);
	System.out.println("�ִ����� : " + min);
	}

}
