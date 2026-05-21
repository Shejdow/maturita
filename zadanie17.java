import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadanie17 {

    public static void main(String[] args) {
        int celkovoHodin = spocitajHodinyVTyzdni();
        
        System.out.println("Predajňa má počas týždňa otvorené " + celkovoHodin + " hodín.");
    }

    public static int spocitajHodinyVTyzdni() {
        int sumaHodin = 0;

        try {
            File subor = new File("hodiny.dat");
            Scanner citac = new Scanner(subor);

            while (citac.hasNextLine()) {
                String riadok = citac.nextLine();

                if (riadok.contains("zatvorene")) {
                    continue;
                }

                String otvaraText = riadok.substring(3, 5);
                String zatvaraText = riadok.substring(11, 13);

                int otvara = Integer.parseInt(otvaraText);
                int zatvara = Integer.parseInt(zatvaraText);

                int hodinZaDen = zatvara - otvara;

                sumaHodin += hodinZaDen;
            }
            
            citac.close();

        } catch (FileNotFoundException e) {
            System.out.println("Chyba: Súbor hodiny.dat sa nenašiel!");
        }

        return sumaHodin;
    }
}