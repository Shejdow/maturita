import java.util.Scanner;

public class zadanie13b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Počet Riadkov: ");
        Integer pocetRiadkov = input.nextInt();
        Kresli(pocetRiadkov);
    }
    public static void Kresli(int pocetRiadkov) {
        for(int i = 1; i <= pocetRiadkov; i++) {
            System.out.println();
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= pocetRiadkov - i; k++) {
                System.out.print("-");
            }
        }
    }
}
