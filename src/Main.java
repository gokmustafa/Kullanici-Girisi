import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName, password;

        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName =input.nextLine();
        System.out.print("Şifrenizi adınız: ");
        password =input.nextLine();

        if (userName.equals("Mustafa") && password.equals("Java123")) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.print("Bilgileriniz yanlış !");
        }


    }
}
