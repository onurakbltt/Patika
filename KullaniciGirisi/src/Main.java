import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName, password, choose;
		Scanner scn = new Scanner(System.in);

		System.out.print("Kullanıcı adınız: ");
		userName = scn.nextLine();

		System.out.print("Şifreniz: ");
		password = scn.nextLine();

		if (userName.equals("patika")) {
			if (password.equals("java123")) {
				System.out.println("Giriş yaptınız");
			} else {
				System.out.print("Şifreniz yanlış.Sıfırlamak istiyor musunuz? (y/n): ");
				choose = scn.nextLine();
				if (choose.equals("y")) {
					String newPassword;
					System.out.print("Yeni şifreyi giriniz: ");
					newPassword = scn.nextLine();
					if (newPassword.equals("java123")) {
						System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz!");
					} else {
						System.out.println("Şifre oluşturuldu");
					}
				}
			}
		} else {
			System.out.println("Bilgileriniz yanlış !");
		}

		scn.close();
	}
}
