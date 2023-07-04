import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		/*
		 * int number = 10;
		 * 
		 * boolean result = number > 0;
		 * 
		 * if (result) { System.out.println("Number Pozitif Bir Sayıdır.");
		 * System.out.println("2."); }else {
		 * System.out.println("Number Negatif Bir Sayıdır."); }
		 * System.out.println("Burası sürekli çalışacak");
		 */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("Bir Sayı Giriniz : "); int number=scan.nextInt(); if(number
		 * % 2 == 0) { System.out.println("girilen sayı çift"); }else {
		 * System.out.println("Girilen sayı tek"); }
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Bir Sayı Giriniz : ");
//		int number = scan.nextInt();
//		if (number < 100 && number >= 1) {
//			System.out.println("Girilen Sayı 1 ile 100 arasında 2 basamaklı");
//		} else if (number < 1000 && number >= 100) {
//			System.out.println("Girilen Sayı 100 ile 1000 arasında 3 basamaklı ");
//		}else if (number < 10000 && number >= 1000) {
//			System.out.println("Girilen Sayı 1000 ile 10000 arasında 4 basamaklı");
//		} else {
//			System.out.println("Girilen sayı 1 ile 9999 arasında değil");
//
//		}

		Scanner scan = new Scanner(System.in);
		System.out.print("Notunuzu Giriniz : ");
		int score = scan.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("AA");
		} else if (score >= 85 && score <= 90) {
			System.out.println("BA");
		} else if (score >= 80 && score <= 85) {
			System.out.println("BB");
		} else if (score >= 75 && score <= 80) {
			System.out.println("CB");
		} else if (score >= 70 && score <= 75) {
			System.out.println("CC");
		} else if (score >= 65 && score <= 70) {
			System.out.println("DC");
		} else if (score >= 60 && score <= 65) {
			System.out.println("DD");
		} else if (score >= 50 && score <= 55) {
			System.out.println("FD");
		} else if (score >= 0 && score < 50) {
			System.out.println("FF");
		}else {
			System.out.println("Lütfen 1 -100 arası olan notunuzu giriniz");
		}
		

	}
}