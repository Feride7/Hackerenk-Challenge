import java.util.Scanner;
public class Deneme {
    public static void main(String[] args) {

        double notHesaplatma;

        System.out.println("***NOT ORTALAMASI HESAPLATMA*** \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen quiz notu giriniz...");
        int qNot = scanner.nextInt();
        System.out.println("Lütfen vize notu giriniz...");
        int vNot = scanner.nextInt();
        System.out.println("Lütfen final notu giriniz...");
        int fNot = scanner.nextInt();

        notHesaplatma = (qNot * 0.10 + vNot * 0.40+fNot * 0.50) / 3;
        System.out.println("Not ortalamanız:" + notHesaplatma + "dir");
        if (notHesaplatma < 50) {
            System.out.println("Üzgünüz dersten kaldınız");
        }else {
            System.out.println("Geçtiniz");
        }
    }
}