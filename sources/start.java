
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

public class Start {
    public static void main(String[] args) {
        readFile();
    }

//Metod som läser från en CSV fil och printar ut varje rad från tabellen
// För att testa: spara "Bread basket" tabellen som CSV, se till att namn, dag etc är separerade med komma
private static void readFile() {
    String line = "", splitBy = ",";

    try {
        BufferedReader br = new BufferedReader(new FileReader("/Users/emma/Desktop/bread basket.csv"));
        while ((line = br.readLine()) != null) {
            String[] products = line.split(splitBy);
        System.out.println("Product [Transaction = " + products[0] + ", Name = " + products[1] + ", Day of week = " + products[3] + ", Weekend/Weekday = " + products[4] + "]");
        }
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}

public void saveData() {
    String line = "", splitBy = ",";

    try {
        BufferedReader br = new BufferedReader(new FileReader("/Users/emma/Desktop/bread basket.csv"));
        String[] products = new String[];
        while ((line = br.readLine()) != null) {
            products = line.split(splitBy);
        }
        for (int i = 1; i < products.length - 1; i++) {
            String transactionNumber = products[0];
            String name = products[1];
            String periodDay = products[3];
            String weekDay = products[4];



            System.out.println("Product [Transaction = " + products[0] + ", Name = " + products[1] + ", Day of week = " + products[3] + ", Weekend/Weekday = " + products[4] + "]");


            public Product(int trans, String name, String periodDay, String weekDay)
            Product p = new Product

            String[]

        }

    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}

}
