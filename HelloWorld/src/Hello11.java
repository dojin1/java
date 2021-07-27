import java.util.Scanner;

public class Hello11 {

	public static void main(String[] args) {
		// Factorial : n!
		// 4! = 4x3x2x1
		// 10! = 10x9x8x7x6x5x4x3x2x1
		// 양의 정수를 입력 받는다. 단, 10이하의 숫자.
		// 팩토리얼을 계산하는 프로그램.
		Scanner s=new Scanner(System.in);
		System.out.println("정수를 입력");
		int n=s.nextInt();
		int f=1;
		for(int i=1; i<=n; i++) {
			f = f*i;
		}
		System.out.println(n+"! = "+f);
		
	}

}
