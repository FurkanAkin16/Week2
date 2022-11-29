package methods;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 6, 5, 0 };
		int aranacak = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayi Mevcuttur:" + aranacak);

		} else {
			mesajVer("Sayi Mevcut Değildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj ) {
		System.out.println(mesaj);
		
	}
}
