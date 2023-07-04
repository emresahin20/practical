package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		String ortaMetin = "ilginizi çekebilir";
		String aitMetin = "Vade süresi";

		double dolarDun = 18.0;
		double dolarBugun = 18.10;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.print(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.print(okYonu);
		} else {
			okYonu = "esıt.svg";
			System.out.print(okYonu);

		}

		String[] krediler = { "Hızlı Kerdi", "Maaşın Halkbanktan", "Mutlu Emekli" };

		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		System.out.println("----------------------------");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
