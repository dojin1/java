//조준호
public class Computermain {
	
	public static void main(String[] args) {
		Computer cpt = new Computer();
		cpt.model = "MS-7C13";
		cpt.Graphic = "RTX2060";
		cpt.Processer = "intel(R) Core(TM) i5-9400F CPU";
		cpt.nRam = "16GB";
		cpt.nPrice = 1500000;
		System.out.println("시스템모델: "+cpt.model);
		System.out.println("프로세서: "+cpt.Processer);
		System.out.println("그래픽카드: "+cpt.Graphic);
		System.out.println("메모리카드: "+cpt.nRam);
		System.out.println("가격: "+cpt.nPrice);
				

	}

}
