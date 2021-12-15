import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println( "Lutfen Kullanıcı Adınızı Giriniz..." );
        String userName = scan.nextLine();
        System.out.println( "Lutfen Şifrenizi Giriniz..." );
        int password = scan.nextInt();
        if("kodluyoruz".equals(userName) && password==12345){
            System.out.println("Giriş Başarılı" );
        }
else{
            System.out.println("Kullanıcı Adı veya Şifre Hatalı");
        }
    }
}
