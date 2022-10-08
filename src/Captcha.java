import java.util.Random;
import java.util.Scanner;

public class Captcha {

    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static int captchaOlustur(){
        int sayi1 = rd.nextInt(10);
        int sayi2 = rd.nextInt(10);
        int top = sayi1 + sayi2;
        System.out.println(String.valueOf(sayi1)+ " + " + String.valueOf(sayi2) +" = ? ");
        return top;

    }
    public static void captchaOnay(){
        int sayac = 0;
        boolean flag = true;
        //  int captchacevap = Captcha.captchaOlustur();
        //  int dogrulama = User.Dogrulama();
        while (flag == true) {
            if (Captcha.captchaOlustur() == User.Dogrulama()) {
                System.out.println("Yonlendiriliyorsunuz....");
                flag = false;
            }
            else{
                System.out.println("Yanlis Cevap");
                sayac++;
            }
            if (sayac == 3) {
                System.out.println("Daha sonra tekrar deneyiniz...");
                try {
                    Thread.sleep(5000);

                }catch (InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
        }

    }
}