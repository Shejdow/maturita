import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie7 {
    static int Riadky = 0;
    static int Stlpce = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadajte počet riadkov: ");
        Riadky = s.nextInt();
        System.out.print("Zadajte počet stĺpcov: ");
        Stlpce = s.nextInt();
        for (int e=0;e<Riadky;e++) {
            System.out.println(" ");
            char[] p = generuj();
            vypis(p);
        }
    }
    public static char[] generuj() {
        char[] r = new char[Stlpce];
            for(int i=0;i<Stlpce;i++) {
                Random rand = new Random();
                r[i] = (char)(rand.nextInt(65,90));
            }
        return r;
    }
    public static void vypis(char[] pole) {
            for(int i=0;i<Stlpce;i++) {
                System.out.print(pole[i] +  ",");
            }
    }
}