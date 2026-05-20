import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Zadajte číslo :");
        Double cislo = input.nextDouble();
        String cislo2 = String.valueOf(cislo);
        int length = cislo2.replace(".", "").length();
        if (cislo % 1 == 0) length = length-1;
        if (cislo.intValue() == 0) length = length-1;
        System.out.println(cislo2 + " " + length);
    }
}
