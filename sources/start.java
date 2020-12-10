
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

//Metod som läser från en CSV fil och skapar ett object av varje rad, samt lägger till varje objekt i listan productList.
// För att testa: spara "Bread basket" tabellen som CSV, se till att namn, dag etc är separerade med komma
private void saveData() {
    String line = "", splitBy = ",";

    try {
        BufferedReader br = new BufferedReader(new FileReader("/Users/emma/Desktop/bread basket.csv"));
        while ((line = br.readLine()) != null) {
            String[] products = line.split(splitBy);
            String transactionNumber = products[0];
            String name = products[1];
            String periodDay = products[3];
            String weekDay = products[4];
            Product p = new Product(transactionNumber, name, periodDay, weekDay);
            productList.add(p);

            //System.out.println("Product [Transaction = " + products[0] + ", Name = " + products[1] + ", Time = "
                    //+ products[2] + ", Day of week = " + products[3] + ", Weekend/Weekday = " + products[4] + "]");
        }
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}

//Metod för att skriva ut listan productList
private void printList() {
    for (Product p : productList) {
        System.out.println(p.getName());
    }
}

}
