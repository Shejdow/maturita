import java.util.Scanner;
import java.util.*;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Zadajte vetu : ");
        String text = input.nextLine();
        for(String result : text.split(" ")){
            StringBuilder rev = new StringBuilder(result);
            System.out.print(rev.reverse()+ " ");
        }
    }
}
