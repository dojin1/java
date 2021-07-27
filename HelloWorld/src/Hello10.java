import java.util.Scanner;

public class Hello10 {

	public static void main(String[] args) {
		// 입력한 값까지의 합계구하기
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int z=0;
		for(int r=1;r<=i;r++) {
			z=z+r;
		}
		System.out.println(i+" 까지의 합계 = "+z);
	}

}
