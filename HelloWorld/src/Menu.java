import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName=new ArrayList<String>(); //ArrayList 공간을 만들어줌 
		this.alPrice=new ArrayList<Integer>(); //ArrayList 공간을 만들어줌 
	}
	
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println("메뉴:"+this.alName.get(i));
			System.out.println("가격:"+this.alPrice.get(i));
			// alName, alPrice 출력.
		}
	}
}
