import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	/*	int x ;
		x=10;
		
		x++;
		x = x+1;
		
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(5%2);
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Bir Sayı Giriniz :");
		int a =scan.nextInt();
		
		System.out.println(a % 2 ==0 ? "Çift sayı":"Tek Sayı");
		*/
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen Şifre Giriniz :");
		String password = scan.nextLine();
		boolean isOk=password.equals("12345");
		System.out.println(isOk?"Şifre Doğru":"Şifre Yanlış");
		
		
		
	}
}
