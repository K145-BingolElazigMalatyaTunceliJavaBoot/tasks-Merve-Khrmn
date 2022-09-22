public class Uce_Tam_Bölünen {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 200; i <= 500; i++) {
            if (i % 3 != 0) {
                total += i;
            }
        }
        System.out.print("3 ile tam bölünemeyen sayıların toplamı:" + total);
    }
}

