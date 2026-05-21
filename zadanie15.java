public class zadanie15 {

    public static void main(String[] args) {
        int celkovoSekund = 82500; 

        
        System.out.println("Počet sekúnd zadaných pre konverziu: " + celkovoSekund);
        System.out.println("Táto hodnota predstavuje po konverzii:");

        
        konvertuj(celkovoSekund);
    }

    public static void konvertuj(int sekundy) {
        int hodiny = 0;
        int minuty = 0;

        for (; sekundy >= 3600; hodiny++) {
            sekundy -= 3600;
        }

        for (; sekundy >= 60; minuty++) {
            sekundy -= 60;
        }

        System.out.println(hodiny + " hodín, " + minuty + " minút a " + sekundy + " sekúnd");
    }
}