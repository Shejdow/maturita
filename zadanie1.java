public class zadanie1 {
    public static void main(String[] args) {
        for(int i = 0; i <= 303; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i + " FutuRum");
            }
            else if (i%3 == 0) {
                System.out.println(i + " Futu");
            }
            else if (i%5 == 0) {
                System.out.println(i + " Rum");
            }
            
        }
    }
}
