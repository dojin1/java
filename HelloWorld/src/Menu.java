import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName=new ArrayList<String>(); //ArrayList ������ ������� 
		this.alPrice=new ArrayList<Integer>(); //ArrayList ������ ������� 
	}
	
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println("�޴�:"+this.alName.get(i));
			System.out.println("����:"+this.alPrice.get(i));
			// alName, alPrice ���.
		}
	}
}
