import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int not;
        System.out.print("Not Giriniz:");
        not=k.nextInt();
        if(not>=0 &&not <=100) {
            if (not > 0 && not <=35) {
                System.out.println("FF");
            } else if (not >35 && not <=50) {
                System.out.println("DC");
            } else if (not > 50 && not <=70) {
                System.out.println("BB");
            } else if (not > 70 && not <= 100) {
                System.out.println("AA");
            }
        }
        else
            System.out.println("Geçersiz Not Girdiniz");


    }
}