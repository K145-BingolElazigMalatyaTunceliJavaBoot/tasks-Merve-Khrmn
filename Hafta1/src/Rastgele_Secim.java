import java.util.Random;
public class Rastgele_Secim {
    public static void main(String[] args) {
        Random random = new Random();
        int sayi = 0;
        int sayac = 0;
        while (sayi < 50 || sayi > 100) {
            sayi = random.nextInt(500);
            sayac++;
        }
        System.out.println(sayac + ".bulunan random sayı : " + sayi);
    }
}