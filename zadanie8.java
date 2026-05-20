import java.util.Scanner;

public class zadanie8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;
        do {
            if (VyhodnotVstup() == 48) {
                run = false;
            }
        } while(run);
        zadanie8.sc.close();
    }
    public static int VyhodnotVstup(){
        System.out.print("Zadajte čislo alebo písmeno: ");
        String input = sc.nextLine();
        char character = input.charAt(0);
        int ascii = (int) character;
        System.out.println(ascii);
        return character;
    }
}
