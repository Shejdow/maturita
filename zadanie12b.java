import java.util.Scanner;

public class zadanie12b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Počet Riadkov: ");
        Integer pocetRiadkov = input.nextInt();
        KresliTrojuholnik(pocetRiadkov);
    }
    public static void KresliTrojuholnik(int pocetRiadkov) {
        for(int i = 1; i <= pocetRiadkov; i++) {
            System.out.println();
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
