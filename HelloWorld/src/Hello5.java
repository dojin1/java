
public class Hello5 {

	public static void main(String[] args) {
		// for���ȿ� for���� �־
		// �������� 2�ܺ��� 9�ܱ��� ���
		for (int r = 2; r <= 9; r++) {
			System.out.println("-"+ r + "��-");
		
			for (int n = 1; n <= 9; n++) {
				System.out.println(r + " x " + n + " = " + r*n);
			}
		}
	}

}
