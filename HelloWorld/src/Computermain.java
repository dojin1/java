//����ȣ
public class Computermain {
	
	public static void main(String[] args) {
		Computer cpt = new Computer();
		cpt.model = "MS-7C13";
		cpt.Graphic = "RTX2060";
		cpt.Processer = "intel(R) Core(TM) i5-9400F CPU";
		cpt.nRam = "16GB";
		cpt.nPrice = 1500000;
		System.out.println("�ý��۸�: "+cpt.model);
		System.out.println("���μ���: "+cpt.Processer);
		System.out.println("�׷���ī��: "+cpt.Graphic);
		System.out.println("�޸�ī��: "+cpt.nRam);
		System.out.println("����: "+cpt.nPrice);
				

	}

}
