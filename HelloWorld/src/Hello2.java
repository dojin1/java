
public class Hello2 {

	public static void main(String[] args) {
		// if while�� 100������ 5�ǹ���� ��� (n % x == 0 : n�� x�� ���)
		// �ݺ������� �ϴ� �Ǽ� = ���ѹݺ� �ϴ� ���(���ѷ���)
		
		int x=1;
		while (x <= 100) {	
			  if (x % 5 == 0) {
			  System.out.println(x);
			}
			  x++;
		}
	}

}

