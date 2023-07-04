import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaşınızı Giriniz : ");
		int age = scan.nextInt();
		System.out.println(age >= 18 ? "Ehliyet Alabilirsiniz " : "Ehliyet Alamazsınız");
	}
}
