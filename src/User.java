import java.util.Scanner;

public class User {
    static Scanner sc = new Scanner(System.in);

    public static int Dogrulama(){
        System.out.println("Cevabi Giriniz: ");
        int cevap = sc.nextInt();
        return cevap;
    }
}
