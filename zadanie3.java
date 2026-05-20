import java.util.Scanner;
import java.math.*;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Zadajte polomer : ");
        Double polomer = input.nextDouble();
        System.out.println("obsah kruhu je : " + Math.round(Math.PI*(polomer*polomer)*100.0) / 100.0);
        System.out.println("Obvod kruhu je : " + Math.round(((2*Math.PI)*polomer)*100.0) / 100.0);
        System.out.println("Objem kruhu je : " + Math.round((4.0/3.0)*Math.PI*(polomer*polomer*polomer)*100.0) / 100.0);
    }
}
