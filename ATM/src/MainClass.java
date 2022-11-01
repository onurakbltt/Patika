import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int right = 3, balance = 1500;
		String userName, password;
		int choose;
		while (right > 0) {
			System.out.print("Kullanıcı adınız: ");
			userName = scn.nextLine();
			System.out.println("Parolanız: ");
			password = scn.nextLine();
			if (userName.equals("patika") && password.equals("dev123")) {
				do {
					System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
					System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
					choose = scn.nextInt();
					switch (choose) {
					case 1:
						System.out.print("Para miktarı: ");
						int price = scn.nextInt();
						balance += price;
						break;
					case 2:
						System.out.print("Para miktarı: ");
						int withdraw = scn.nextInt();
						if (withdraw > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= withdraw;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: " + balance);
						break;
					default:
						break;
					}
				} while (choose != 4);
				System.out.println("Tekrar görüşmek üzere.");
				break;

			} else {
				right--;
				System.err.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
				} else {
					System.err.println("Kalan hakkınız: " + right);
				}
			}
		}
		scn.close();
	}

}
