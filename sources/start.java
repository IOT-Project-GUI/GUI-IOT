
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// en class


public class start {
    public static void main(String[] args) {
    }

//Metod som läser från en CSV fil och printar ut varje rad från tabellen
// För att testa: spara "Bread basket" tabellen som CSV, se till att namn, dag etc är separerade med komma
private void readFile() {
    String line = "", splitBy = ",";

    try {
        BufferedReader br = new BufferedReader(new FileReader("/Users/Natasha/Desktop/HT 2020/breadCSV.csv"));
        while ((line = br.readLine()) != null) {
            String[] products = line.split(splitBy);
            System.out.println("Product [Transaction = " + products[0] + ", Name = " + products[1] + ", Time = "
                    + products[2] + ", Day of week = " + products[3] + ", Weekend/Weekday = " + products[4] + "]");
        }
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}


}
