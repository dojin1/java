import java.util.ArrayList;

public class Hello12 {

	public static void main(String[] args) {
		int[] pnt = new int[5];//default
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("John"); //����(create)
		studentName.add("Jane"); 
		studentName.add("Jacob"); 
		studentName.add("Johanson"); 
		studentName.add("Jason"); 
		studentName.add("James"); 
		for(int i=0; i<studentName.size();i++) {
			System.out.println(studentName.get(i));//��ȸ(read)
		}
		System.out.println("\n\n\n");
		studentName.set(3, "Jefferson"); // ����(update) replace
		for(int i=0; i<studentName.size();i++) {
			System.out.println(studentName.get(i));//��ȸ
		}
	}

}
