
public class Hello2 {

	public static void main(String[] args) {
		// if while문 100이하의 5의배수만 출력 (n % x == 0 : n은 x의 배수)
		int x=0;
		// 반복문에서 하는 실수 = 무한반복 하는 경우(무한루프)
		
		while (x <= 100) {	
			  if (x % 5 == 0) {
			  System.out.println(x);
			}
			  x++;
		}
	}

}

