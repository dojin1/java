
public class Hello7 {

	public static void main(String[] args) {
		//  10,000 이하의 피보나치 수열 구하기.
		int a = 0;
		int b = 1;
		int c = 0;
		for(int r=1; c<=10000; r++) {
			a = b;
			b = c;
			c = a + b;
			if(c<10000) {
				System.out.println(c);
			}
			
									
		}
	}

}
