import java.util.Scanner;

public class Hello9 {

	public static void main(String[] args) {
		// 양의 정수 두개를 순서대로 입력받는다.
		// 최소공배수 최대공약수를 구한다.
		// 출력
		
		Scanner s=new Scanner(System.in);
		System.out.println("숫자 입력");
		int a=s.nextInt();
		int b=s.nextInt();
		
		int i=2; //나누는값?
		int max=0; //최대공약수
		int min=0; //최소공배수
		// ex) a=12 , b=8
		// 최소공배수 = a*b/최대공약수
		// 초기화식 생략가능 ; 초기화식 여러개일경우 "," 조건식 여러개일경우 "&&" p122
		for(; i<=a && i<=b; i++) { 
			if(a%i==0 && b%i==0) 
				max=i;
									
		}
		min = a*b/max;
		System.out.println("최대공약수 : "+max);
		System.out.println("최소공배수 : "+min);
	}

}
