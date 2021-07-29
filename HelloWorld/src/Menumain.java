import java.util.ArrayList;
import java.util.Scanner;

public class Menumain {

	public static void main(String[] args) {
		Menu menu = new Menu();
		// 메뉴이름/가격을 입력하는 루틴
		// 메뉴이름이 ""이 입력되면 루틴(반복문) 종료.
		// 그동안 입력된 메뉴명/가격 출력.
		Scanner s1 = new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		menu.init();
		System.out.println("메뉴명/가격 입력, 메뉴공백 입력시 종료 후 입력된 메뉴/가격 출력");
		String m=s1.nextLine(); //문자열 입력받고 반복문가서 메뉴배열추가 가격입력받고 가격배열추가
		while(!m.equals("")) {	//그다음 문자열입력받고 공백있는지 확인 또 반복. 인터프리터 방식 순서위치 중요.
			menu.addName(m);
			int p=s2.nextInt();
			menu.addPrice(p);
			m=s1.nextLine();
		}
		menu.showMenu();
		
	}

}
