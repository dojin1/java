import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		/*
		 * 1.사용자 입력을 받는다 (Scanner,nextLine())
		 * 2.입력값이 "x"면 "프로그램 종료"를 출력하고 프로그램 종료.
		 * 3.입력값이 (a) "m"이면 "메뉴리스트" 출력 (if-else if/switch)
		 * 			(b)	"b"이면 "주문" 출력
		 * 			(c)	"s"이면 "매출현황" 출력
		 * 4. (1)로 돌아간다.
		 */
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		while(!n.equals("x")) {
			switch(n) {
			case "m" : 
				System.out.println("메뉴리스트"); break;
			case "b" :
				System.out.println("주문"); break;
			case "s" :
				System.out.println("매출현황"); break;
			
			}
			n=s.nextLine();
		}
		System.out.println("프로그램 종료");
		
		
	}
}
		
	  
	


