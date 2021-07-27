

public class Hello8 {

	public static void main(String[] args) {
		// 소수(Prime Number) -1과 자기자신 밖에는 나눠지지 않는 수
		// N이라는 숫자가 있으면 2부터 N-1까지 숫자로 N을 나눈다.
		// 한번도 나머지가 0이 아니면 N은 소수
		// 2부터 10000까지 사이의 있는 모든 소수를 출력.
		// 한번이라도 나머지가 0이면 break;
		// break로 나오면, 소수가 아님.
		// break로 나오지 않고, for문이 모두 실행됐으면 소수
		for(int i=2; i<=10000; i++) {
			int n=2;
			for(n=2; n<i; n++) {
				if(i%n==0) {
					break;
				}
			}
			if(i==n) {
				System.out.println(n);
			}
		}
	}

}
