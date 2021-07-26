
public class Hello5 {

	public static void main(String[] args) {
		// for문안에 for문을 넣어서
		// 구구단을 2단부터 9단까지 출력
		for (int r = 2; r <= 9; r++) {
			System.out.println("-"+ r + "단-");
		
			for (int n = 1; n <= 9; n++) {
				System.out.println(r + " x " + n + " = " + r*n);
			}
		}
	}

}
