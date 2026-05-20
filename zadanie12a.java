import java.util.Scanner;

public class zadanie12a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pocet riadkov: ");
        Integer riadky = input.nextInt();
        kresliStromcek(riadky);
    }
    public static void kresliStromcek(int riadky) {
        for(int i = 1; i <= riadky; i++) {
            System.out.println("");
            for(int k = riadky; k >= i; k--) {
                System.out.print(" ");
            }
                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
    }
}
