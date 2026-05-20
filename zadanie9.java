import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte číslo: ");
        int input = sc.nextInt();
        Faktor fk = new Faktor();
        System.out.println(fk.pocitaj(input));
        sc.close();
    }
}
class Faktor {
    public int pocitaj(int f){
        int result = 1;
        for(int i = 1;i<=f;i++) {
            result = result * i;
        }
        return result;
    }
}
