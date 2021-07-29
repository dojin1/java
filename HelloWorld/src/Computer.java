//조준호.
public class Computer {
	String nRam; // 메모리카드 용량
	String model; // 시스템 모델
	int nPrice; // 컴퓨터 가격
	String Graphic; //그래픽카드
	String Processer; // 프로세서
	public String getnRam() {
		return nRam;
	}
	public void setnRam(String nRam) {
		this.nRam = nRam;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getnPrice() {
		return nPrice;
	}
	public void setnPrice(int nPrice) {
		this.nPrice = nPrice;
	}
	public String getGraphic() {
		return Graphic;
	}
	public void setGraphic(String graphic) {
		Graphic = graphic;
	}
	public String getProcesser() {
		return Processer;
	}
	public void setProcesser(String processer) {
		Processer = processer;
	}
	
}
