import java.util.Scanner;

public class zadanie13a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Počet Riadkov: ");
        Integer riadky = input.nextInt();
        KresliDomcek(riadky);
    }
    public static void KresliDomcek(int riadky) {
        for(int i = 1; i <= riadky; i++) {
            System.out.print("*");
        }
        System.out.println();

            for (int i = 1; i <= riadky-2; i++) {
                System.out.print("*");
                for(int j = 1; j <= riadky-2; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                System.out.println();
            }

            for (int i = 1; i <= riadky; i++) {
                System.out.print("*");
            }
    }
}
