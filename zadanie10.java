import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte hodnotu Od: ");
        int num1 = sc.nextInt();
        System.out.print("Zadajte hodnotu Do: ");
        int num2 = sc.nextInt();
        Tabulka tb = new Tabulka();
        tb.TableOutput(num1, num2);
    }
}
class Tabulka {
    public static void TableOutput(int from, int to) {
        for(int i=from;i<=to;i++) {
            System.out.println(i + " " + (char)i);
        }
    }
}
