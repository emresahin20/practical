import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		
		//if(x<y) {
		//	System.out.println("y x den büyüktür");
			
		//}else {
		//	System.out.println("y x den küçüktür");
		//}
		
		Scanner scan = new Scanner (System.in);
		int i =scan.nextInt();
		System.out.println(x>i? "x i den büyüktür" : "x i den küçüktür");
	}
}
