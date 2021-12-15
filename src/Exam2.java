import java.util.Scanner;
public class Exam2 {
    public static void main(String[] args) {

        float  islem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz : ");
            float a = scan.nextFloat();
       System.out.println("Lütfen ikinci sayıyı giriniz : ");
            float b = scan.nextFloat();
       islem=a+b;

       System.out.format("double : %.2f", islem);

    }}



       /* System.out.println(" Lutfen birinci sayiyi giriniz: ");
        scanf("%f", &a);
        printf(" Lutfen ikinci sayiyi giriniz: ");
        scanf("%f", &b);
        islem=a+b;

        printf("Islem sonucu=%.2f",islem);*/


