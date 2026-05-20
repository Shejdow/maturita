import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class zadanie14 {
    static String data = "";
    static HashMap<String, Integer> Numbers = new HashMap<>();
    static ArrayList<String> dataa = new ArrayList<>();
    public static void main(String[] args) {
        File cisla = new File("D:\\pythonfiles\\Java\\cisla.txt");

        try(Scanner scanner = new Scanner(cisla)){
            while(scanner.hasNextLine()){
                data = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ty číčo error!");
            e.printStackTrace();
        }
        String[] a = data.split("-");
        for(int i=0;i<a.length;i++) {
            if(Numbers.containsKey(a[i])){
                Numbers.put(a[i], Numbers.get(a[i])+1);
            } else {
                Numbers.put(a[i], 1);
            }
        }
        for (String i : Numbers.keySet()) {
            if(Numbers.get(i)==1){
                System.out.println("Unikatné čišlo: " + i);
            } 
        }
        for (String x : Numbers.keySet()) {
        if(Numbers.get(x)>1) {
                System.out.println("Číslo " + x + " | " + Numbers.get(x) + " x");
            }
        }
    }
}
