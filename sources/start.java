
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;

public class Start {
    private ArrayList<Product> productList = new ArrayList<Product>();
    
    public static void main(String[] args) {
        Start start = new Start();
        start.saveData();
    }

//Metod som läser från en CSV fil och printar ut varje rad från tabellen
// För att testa: spara "Bread basket" tabellen som CSV, se till att namn, dag etc är separerade med komma
public void saveData() {
    String line = "", splitBy = ",";

    try {
        BufferedReader br = new BufferedReader(new FileReader("/Users/emma/Desktop/bread basket.csv"));
        String[] products = new String[0];
        while ((line = br.readLine()) != null) {
            products = line.split(splitBy);
        }
        for (int i = 1; i < products.length - 1; i++) {
            String transactionNumber = products[0];
            String name = products[1];
            String periodDay = products[3];
            String weekDay = products[4];

            Product p = new Product(transactionNumber, name, periodDay, weekDay);
            productList.add(p);
            int j = 1;
            System.out.println(j);
            i++;
        }

    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}

}
