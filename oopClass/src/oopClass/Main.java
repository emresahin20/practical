package oopClass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HesapMakinesi islem = new HesapMakinesi();
		System.out.println("Bir Sayı Giriniz");
		islem.a = scan.nextInt();
		System.out.println("Bir Sayı Giriniz");
		islem.b = scan.nextInt();

		System.out.println("Bir işlem Seçiniz");

		int islem1 = islem.bölme(0, 0);
		
	}
}
