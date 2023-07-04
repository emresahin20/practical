import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		boolean sonuc = 9 != 9;
		System.out.println(sonuc);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("İsim : ");
		String ad1 = scan.nextLine();
		String ad2 = scan.nextLine();
		
		System.out.println(ad1.equals(ad2));
		
	}
}
