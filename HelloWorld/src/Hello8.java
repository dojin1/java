

public class Hello8 {

	public static void main(String[] args) {
		// �Ҽ�(Prime Number) -1�� �ڱ��ڽ� �ۿ��� �������� �ʴ� ��
		// N�̶�� ���ڰ� ������ 2���� N-1���� ���ڷ� N�� ������.
		// �ѹ��� �������� 0�� �ƴϸ� N�� �Ҽ�
		// 2���� 10000���� ������ �ִ� ��� �Ҽ��� ���.
		// �ѹ��̶� �������� 0�̸� break;
		// break�� ������, �Ҽ��� �ƴ�.
		// break�� ������ �ʰ�, for���� ��� ��������� �Ҽ�
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
