import java.util.Scanner;

public class Hello11 {

	public static void main(String[] args) {
		// Factorial : n!
		// 4! = 4x3x2x1
		// 10! = 10x9x8x7x6x5x4x3x2x1
		// ���� ������ �Է� �޴´�. ��, 10������ ����.
		// ���丮���� ����ϴ� ���α׷�.
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է�");
		int n=s.nextInt();
		int f=1;
		for(int i=1; i<=n; i++) {
			f = f*i;
		}
		System.out.println(n+"! = "+f);
		
	}

}
