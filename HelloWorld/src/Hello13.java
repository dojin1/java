import java.util.ArrayList;
import java.util.Scanner;

public class Hello13 {

	public static void main(String[] args) {
		// ArrayList/Scanner이용.
		// 학생들의 수학점수를 읽어들이는 프로그램
		// -1이 들어올때까지 ArrayList 입력값이 채워지면서 늘어난다.
		// 읽어들이기가 끝나면,
		// (1) 모든 학생의 점수를 출력
		// (2) 점수의 총합계, 평균점수를 계산해서 출력
		// 아래 루틴 공부
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> point=new ArrayList<Integer>();
		System.out.println("수학점수 입력, -1 입력시 종료 후 점수출력");
		int sum=0; //합계
		int t=s.nextInt();
		while(t!=-1) {
			point.add(t);
			t=s.nextInt();
		} 
		System.out.println("점수 출력");
		for (int i=0; i<point.size(); i++) {
			System.out.println(point.get(i));
		}
		for (int i=0; i<point.size(); i++) {
			sum=sum+point.get(i);
		}
		
		System.out.println("총합계 : "+sum);
		System.out.println("평균점수 : "+sum/point.size());
	}

}
