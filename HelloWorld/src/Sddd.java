import java.util.Scanner;

public class Sddd {

	public static void main(String[] args) {
		// for문으로 1부터 10까지 출력
	Scanner s=new Scanner(System.in);
	int a, b, max=0, min=0, i=2;
	System.out.println("두 수 입력 : ");
	a = s.nextInt();
	b = s.nextInt();
	for(; i<=a && i<=b; i++) {
		if(a%i==0 && b%i==0) 
			min=1;
			
		
			
		
	}
	max=a*b/min;
	System.out.println("최소공배수 : " + max);
	System.out.println("최대공약수 : " + min);
	}

}
