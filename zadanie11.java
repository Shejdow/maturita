import javax.management.BadBinaryOpValueExpException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class zadanie11 {
    public static void main(String[] args) {
        String file = "C:\\Users\\lukib\\Desktop\\javabratu\\randomahh\\zadania\\src\\znamky.csv";
        BufferedReader reader = null;
        String line = "";
        String students = "";
        ArrayList<Ziak> zoznamZiakov = new ArrayList<>();

        try{
            reader = new BufferedReader(new FileReader(file));
            reader.readLine();
            while((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                ArrayList<Integer> znamky = new ArrayList<>();
                for(int i = 2;i< row.length;i++) {
                    znamky.add(Integer.parseInt(row[i]));
                }
                int pozicia = -1;
                for(int i = 0;i< zoznamZiakov.size();i++) {
                    if(zoznamZiakov.get(i).name.equals(row[0])) {
                        pozicia = i;
                    }
                }
                if(pozicia == -1) {
                    Ziak Z = new Ziak(row[0]);
                    Z.prirad(row[1],znamky);
                    zoznamZiakov.add(Z);
                }
                else{
                    zoznamZiakov.get(pozicia).prirad(row[1],znamky);
                }
            }
            for(int i = 0;i< zoznamZiakov.size();i++) {
                System.out.println(zoznamZiakov.get(i).toString());

            }
        }
        catch(Exception e)  {
            e.printStackTrace();
        }
        finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class Ziak {
    String name = "";
    ArrayList<Predmet> items = new ArrayList<>();
    Ziak() {
        name = "";
        items = new ArrayList<>();
    }
    Ziak(String name) {
        this();
        this.name = name;
    }
    public void prirad(String nazovp, ArrayList<Integer> znamky) {
        Predmet p = new Predmet(nazovp,znamky);
        items.add(p);
    }

    @Override
    public String toString() {
        String ret = name + " " + items.toString();
        return ret;
    }
}
class Predmet {
    String nazov;
    ArrayList<Integer> znamky;
    Predmet() {
        nazov = "";
        znamky = new ArrayList<>();
    }
    Predmet(String nazov, ArrayList<Integer> znamky) {
        this();
        this.nazov = nazov;
        this.znamky.addAll(znamky);
    }

    double Premier(){
        double sum = 0.0;
        for (int num : znamky) {
            sum += num;
        }

        double average = (double) sum / znamky.size();
        return average;
    }
    @Override
    public String toString() {
        String rett = nazov + " " + znamky.toString() + " " + Math.round(Premier()*100)/100.0;
        return rett;
    }
}