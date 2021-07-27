import java.util.Scanner;

public class Hello6 {
	//¤©ÀÚ gg
	public static void main(String[] args) {
		int n=4;
		int s=1;
		for(int i=0;i<n;i++) {
			if(i%2 == 0) {
				for(int j=0;j<n;j++) {
					s++;
					System.out.print(s+"\t");
				}
				System.out.println("");
			}else {
				for(int j=n;j>0;j--) {
					System.out.println(s+j+"\t");
				}
				System.out.println("");
				s=s+n;
			
			}
		}
			
		
		
		
	}

}
