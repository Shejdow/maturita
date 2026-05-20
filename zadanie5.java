import java.util.Random;

public class zadanie5 {
    public static void main(String[] args) {
        int stlpce = 10;
        int[] riadok = new int[stlpce];
        Random rand = new Random();
        for(int e=0;e<10;e++) {
            System.out.println();
            for(int i=0;i<10;i++) {
                int value = rand.nextInt(89);
                riadok[i]=value;
                System.out.print(riadok[i] + ",");
            }
        }
    }
}
