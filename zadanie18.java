import java.util.Random;

public class zadanie18 {

    public static void main(String[] args) {
        int[] pole = vygenerujPole(10);

        System.out.print("Vygenerované pole: ");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i]);
            if (i < pole.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        najdiAMajVypisMinMax(pole);
    }

    public static int[] vygenerujPole(int velkost) {
        int[] novePole = new int[velkost];
        Random random = new Random();

        for (int i = 0; i < novePole.length; i++) {
            novePole[i] = random.nextInt(10) + 1;
        }

        return novePole;
    }

    public static void najdiAMajVypisMinMax(int[] pole) {
        int max = pole[0];
        int min = pole[0];

        for (int i = 1; i < pole.length; i++) {
            if (pole[i] > max) {
                max = pole[i];
            }
            if (pole[i] < min) {
                min = pole[i];
            }
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}