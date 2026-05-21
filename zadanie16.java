import java.util.Scanner;

public class zadanie16 {

    public static void main(String[] args) {
        String veta = nacitajVetu();

        analyzujVetu(veta);
    }

    public static String nacitajVetu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte vstupnú vetu:");
        
        String zadanyText = scanner.nextLine();
        
        return zadanyText;
    }

    public static void analyzujVetu(String veta) {
        int pocetPismen = veta.length();

        String[] slova = veta.split(" ");
        int pocetSlov = slova.length;

        System.out.println("Zadali ste tuto vstupnú vetu: " + veta);
        System.out.println("Počet písmen v zadanej vete: " + pocetPismen + " (vrátane medzier)");
        System.out.println("Počet slov v zadanej vete: " + pocetSlov);
    }
}