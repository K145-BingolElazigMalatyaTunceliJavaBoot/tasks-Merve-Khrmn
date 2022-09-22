public class AsalSayi {
    public static void main(String[] args) {
        int total = 0;
        for (int num = 3; num <= 100; num++) {
            int control = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    control = 1;
                    break;
                }
            }
            if (control == 0) {
                total += num;
            }
        }
        System.out.printf("Asal sayıların toplamı:" + total);
    }
}
