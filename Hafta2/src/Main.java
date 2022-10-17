import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hatcback hatcback=new Hatcback();
        System.out.println("Gün Sayısı: ");
        int day=sc.nextInt();

        System.out.print("1) Bireysel kiralama\n 2) Şirket için kiralama ");
        int customer=sc.nextInt();
        hatcback.setDailyRentPrice(15);
        hatcback.setMonthlyRentPrice(10);
        if(customer==1) {
            System.out.println(hatcback.dailyRent(15));

        }
        else {
            SUV suv=new SUV();
            Sedan sedan=new Sedan();
            suv.setDailyRentPrice(15);
            suv.setMonthlyRentPrice(10);
            sedan.setDailyRentPrice(15);
            sedan.setMonthlyRentPrice(10);
            System.out.println("SUV günlük:" + suv.dailyRent(10));
            System.out.println(suv.monthlyRent(15));
        }

    }
}
