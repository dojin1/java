import java.util.Scanner;

public class Hello10 {

	public static void main(String[] args) {
		// �Է��� �������� �հ豸�ϱ�
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int z=0;
		for(int r=1;r<=i;r++) {
			z=z+r;
		}
		System.out.println(i+" ������ �հ� = "+z);
	}

}
